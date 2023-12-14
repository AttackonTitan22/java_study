package com.zhounian.map;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//根据键值对来遍历
public class MapDemo2 {
    public static void main(String[] args) {


        Map<String, String> map = new HashMap<>();


        map.put("尹志平", "小龙女");
        map.put("郭靖", "穆念慈");
        map.put("欧阳克", "黄蓉");

        Set<Map.Entry<String, String>> entries = map.entrySet();


        //增强for
        for (Map.Entry<String,String> entry:entries)
        {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        System.out.println();

        //迭代器
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey()+":"+next.getValue());
        }

        System.out.println();


        //lambda
        entries.forEach(entry->System.out.println(entry.getKey()+":"+entry.getValue()));

    }
}
