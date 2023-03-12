package com.itsjxixi.regex.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 爬虫
 * 爬取前端静态邮箱
 */
public class Main8 {
    public static void main(String[] args) throws IOException {
        List<String> list = getMailsByweb();
        for (String mail : list) {
            System.out.println(mail);
        }

    }
    public static List<String> getMailsByweb() throws IOException {
        List<String> list = new ArrayList<String>();
        // 1.读取源文件
        //BufferedReader br = new BufferedReader(new FileReader("c:\\mail.html"));
        URL url =
                new URL("https://www.huas.edu.cn/");
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

        // 2.对读取的数据进行规则的匹配。从中获取符合规则的数据。
        String mailRegex = "\\w+@\\w+(\\.\\w+)+";

        Pattern p = Pattern.compile(mailRegex);
        String line = null;

        while ((line = br.readLine()) != null) {
            Matcher m = p.matcher(line);
            while (m.find()) {
                // 3.将符合规则的数据存储到集合中
                list.add(m.group());
            }
        }
        return list;
    }

}
