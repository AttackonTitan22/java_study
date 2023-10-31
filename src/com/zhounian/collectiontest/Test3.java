package com.zhounian.collectiontest;
//获取一个迭代器
// 引入 ArrayList 和 Iterator 类
import java.util.ArrayList;
import java.util.Iterator;

public class Test3 {
    public static void main(String[] args) {

        // 创建集合
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");

        // 获取迭代器
        Iterator<String> it = sites.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> itt = numbers.iterator();
        while(itt.hasNext()) {
            Integer i = itt.next();
            if(i < 10) {
                itt.remove();  // 删除小于 10 的元素
            }
        }
        System.out.println(numbers);
        while(itt.hasNext())
        {
            System.out.println(itt.next());
        }
    }
}