package com.itsjxixi.collection.main;

import java.util.*;

/**
 * 建立国家的缩写和完整名称之间的映射关系（键key---值value）
 */
public class Main13 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        // 添加值 put
        map.put("cn", "china");
        map.put("usa", "american");
        map.put("jp", "japan");
        map.put("en", "england");
        map.put("in", "indian");

        System.out.println(map);
        // 获取值 get
        System.out.println(map.get("cn"));
        // 获取所有 键 keySet
        Set<String> set = map.keySet();
        System.out.println(set);
        // 获取所有 值 values
        Collection<String> values = map.values();
        System.out.println(values);
        //
        Set<Map.Entry<String, String>> set2 = map.entrySet();
        System.out.println(set2);
        // 查询是否存在 键 containsKey
        System.out.println(map.containsKey("jp"));
        // 查询是否存在 值 containsValue
        System.out.println(map.containsValue("indian"));
        // 删除指定 键 的 值， 返回 值 remove
        String jp = map.remove("jp");
        System.out.println(jp);
        System.out.println(map);
        // 获取元素个数
        System.out.println(map.size());
    }
}
