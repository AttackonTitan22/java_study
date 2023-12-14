package com.zhounian.immutable;

import javax.lang.model.element.Element;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableDemo1 {
    public static void main(String[] args) {

        //不可变集合，不可修改和删除
        List<String> list = List.of("A", "B", "C", "D");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        System.out.println();


        //不可变set必须保证元素的唯一性 Set.of("A", "A", "B", "C", "D");会报错
        Set<String> set = Set.of("A", "B", "C", "D");

        for(String s:set)
            System.out.println(s);

        //map
        Map<String, String> map = Map.of("A", "a", "B", "b", "C", "c", "D", "d", "E", "e", "F", "f", "G", "g");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String,String> entry:entries)
            System.out.println(entry.getKey()+"="+entry.getValue());

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("A","a");
        hashMap.put("B","b");
        hashMap.put("C","c");
        hashMap.put("D","d");
        hashMap.put("E","e");
        hashMap.put("F","f");
        hashMap.put("G","g");
        hashMap.put("H","h");
        hashMap.put("I","i");
        hashMap.put("J","j");
        hashMap.put("k","k");

        Set<Map.Entry<String, String>> entries1 = hashMap.entrySet();

        Map.Entry[] e = entries1.toArray(new Map.Entry[0]);

        Map map1 = Map.ofEntries(e);

        System.out.println(map1);

        //jdk=10以后
        Map.copyOf(hashMap);


    }
}
