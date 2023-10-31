package com.zhounian.HashSetDemo;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> sites = new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");  // 重复的元素不会被添加
        System.out.println(sites);

        //使用 contains() 方法来判断元素是否存在于集合当中:
        System.out.println(sites.contains("Taobao"));

        //使用 remove() 方法来删除集合中的元素:
        sites.remove("Taobao");  // 删除元素，删除成功返回 true，否则为 false
        System.out.println(sites);

        //计算 HashSet 中的元素数量可以使用 size() 方法：
        System.out.println(sites.size());

        //删除集合中所有元素可以使用 clear 方法：
        sites.clear();
        System.out.println(sites);


    }
}
