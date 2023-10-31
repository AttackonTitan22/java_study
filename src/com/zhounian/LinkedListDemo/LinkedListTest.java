package com.zhounian.LinkedListDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites);

        //在列表开头添加元素：
        // 使用 addFirst() 在头部添加元素
        sites.addFirst("Wiki");
        System.out.println(sites);

        // 使用 addLast() 在尾部添加元素
        sites.addLast("Wiki");
        System.out.println(sites);

        // 使用 removeFirst() 移除头部元素
        sites.removeFirst();
        System.out.println(sites);

        // 使用 removeLast() 移除尾部元素
        sites.removeLast();
        System.out.println(sites);

        // 使用 getFirst() 获取头部元素
        System.out.println(sites.getFirst());

        // 使用 getLast() 获取尾部元素
        System.out.println(sites.getLast());

        Iterator<String> iterator = sites.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
