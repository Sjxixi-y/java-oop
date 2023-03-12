package com.itsjxixi.collection.main;

import java.util.*;

/**
 * 遍历方式
 * Map
 */
public class Main14 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("cn", "china");
        map.put("usa", "american");
        map.put("jp", "japan");
        map.put("en", "england");
        map.put("in", "indian");

        // 1.通过Key
        Set<String> strings = map.keySet();
        Iterator<String> it1 = strings.iterator();
        while (it1.hasNext()) {
            String K = it1.next();
            System.out.println(K + "=" + map.get(K));
        }
        System.out.println("_________________________________");
        // 2.通过Value,只能得到values
        Collection<String> values = map.values();
        Iterator<String> it2 = values.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
        System.out.println("_________________________________");
        // 3.获取键和值
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> it3 = entries.iterator();
        while (it3.hasNext()) {
            Map.Entry<String, String> E = it3.next();
            System.out.println(E.getKey() + "======" + E.getValue());
        }

    }
}
