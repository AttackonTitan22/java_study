package com.zhounian.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<StringBuilder> sites = new ArrayList<>();
        //添加元素到 ArrayList 可以使用 add() 方法:
        sites.add(new StringBuilder("Google"));
        sites.add(new StringBuilder("Runoob"));
        sites.add(new StringBuilder("Taobao"));
        sites.add(new StringBuilder("Weibo"));

//        Iterator<String> iterator = sites.iterator();
//        while (iterator.hasNext())
//        {
//            System.out.println(iterator.next());
//        }


        //浅拷贝  例子
        ArrayList<StringBuilder> clone = (ArrayList<StringBuilder>) sites.clone();
        System.out.println(clone.get(0));
        clone.get(0).append("sdf");
        System.out.println(clone.get(0));
        System.out.println(sites.get(0));

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        Integer[] l = list.toArray(new Integer[9]);
        for (Integer i : l) {
            System.out.println(i);
        }

        int[] a = new int[10];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        a[4] = 5;
        System.arraycopy(a, 2, a, 3, 1);
        a[2]=99;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
