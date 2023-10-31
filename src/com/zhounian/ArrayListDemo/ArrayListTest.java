package com.zhounian.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        //添加元素到 ArrayList 可以使用 add() 方法:
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites);
        //访问 ArrayList 中的元素可以使用 get() 方法：
        System.out.println(sites.get(1));  // 访问第二个元素

        //如果要修改 ArrayList 中的元素可以使用 set() 方法：
        sites.set(2, "Wiki"); // 第一个参数为索引位置，第二个为要修改的值
        System.out.println(sites);

        //如果要删除 ArrayList 中的元素可以使用 remove() 方法：
        sites.remove(3); // 删除第四个元素
        System.out.println(sites);

        //如果要计算 ArrayList 中的元素数量可以使用 size() 方法：
        System.out.println(sites.size());

        Iterator<String> iterator = sites.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
