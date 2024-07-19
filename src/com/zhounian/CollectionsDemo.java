package com.zhounian;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>(16, 0.75f, true);
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        //访问元素2,该元素会被移动至链表末端
        map.get(2);
        //访问元素3,该元素会被移动至链表末端
        map.get(3);
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}