package com.zhounian.map;

import java.util.*;


//键找值来遍历
public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();


        map.put("尹志平", "小龙女");
        map.put("郭靖", "穆念慈");
        map.put("欧阳克", "黄蓉");

        Set<String> keys = map.keySet();

        //增强for
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key + ":" + value);
        }

        System.out.println();

        //迭代器
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = map.get(key);
            System.out.println(key + ":" + value);
        }
        System.out.println();
        //lambda
        keys.forEach(key -> System.out.println(key + ":" + map.get(key)));
    }
}
