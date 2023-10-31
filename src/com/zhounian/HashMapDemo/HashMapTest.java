package com.zhounian.HashMapDemo;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        // 创建 HashMap 对象 Sites
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        // 添加键值对
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        System.out.println(Sites);

        // 创建 HashMap 对象 Sites
        HashMap<String, String> Sites_string = new HashMap<String, String>();
        // 添加键值对
        Sites_string.put("one", "Google");
        Sites_string.put("two", "Runoob");
        Sites_string.put("three", "Taobao");
        Sites_string.put("four", "Zhihu");
        System.out.println(Sites_string);

        //使用 get(key) 方法来获取 key 对应的 value:
        System.out.println(Sites.get(3));

        //使用 remove(key) 方法来删除 key 对应的键值对(key-value):
        Sites.remove(4);
        System.out.println(Sites);

        //计算 HashMap 中的元素数量可以使用 size() 方法：
        System.out.println(Sites.size());

        //删除所有键值对(key-value)可以使用 clear 方法：
        Sites.clear();
        System.out.println(Sites);
    }
}
