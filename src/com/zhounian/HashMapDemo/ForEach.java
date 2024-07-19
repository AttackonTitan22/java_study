package com.zhounian.HashMapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ForEach {
    public static void main(String[] args) {
        // 创建并赋值 HashMap
        Map<Integer, String> map = new HashMap();
        map.put(1, "Java");
        map.put(2, "JDK");
        map.put(3, "Spring Framework");
        map.put(4, "MyBatis framework");
        map.put(5, "Java中文社群");

        // 1.迭代器 EntrySet
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        // 2.迭代器 KeySet
        Iterator<Integer> iterator_keySet = map.keySet().iterator();
        while (iterator_keySet.hasNext()) {
            Integer key = iterator_keySet.next();
            System.out.println(key);
            System.out.println(map.get(key));
        }

        // 3.ForEach EntrySet
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        // 4.ForEach KeySet
        for (Integer key : map.keySet()) {
            System.out.println(key);
            System.out.println(map.get(key));
        }

        // 5.Lambda
        map.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value);
        });

        // 6.Streams API 单线程
        map.entrySet().stream().forEach((entry) -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });

        // 7.Streams API 多线程
        map.entrySet().parallelStream().forEach((entry) -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });


    }
}
