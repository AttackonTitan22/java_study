package com.zhounian.collectiontest;

import java.util.*;
import java.util.function.Consumer;

//遍历ArrayList
public class Test1{
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("HAHAHAHA");
        //第一种遍历方法使用 For-Each 遍历 List
        for (String str : list) {            //也可以改写 for(int i=0;i<list.size();i++) 这种形式
            System.out.println(str);
        }

        //第二种遍历，把链表变为数组相关的内容进行遍历
        String[] strArray=new String[list.size()];
        list.toArray(strArray);
        for(int i=0;i<strArray.length;i++) //这里也可以改写为  for(String str:strArray) 这种形式
        {
            System.out.println(strArray[i]);
        }

        //第三种遍历 使用迭代器进行相关遍历

        Iterator<String> ite=list.iterator();
        while(ite.hasNext())//判断下一个元素之后有值
        {
            System.out.println(ite.next());
        }

        //第四种遍历，forEach 匿名内部类
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //第五种遍历，forEach lambda表达式
        list.forEach(s-> System.out.println(s));

        //第六种遍历： 列表迭代器
        //获取一个列表迭代器的对象，里面的指针默认也是指向0索引的

        //额外添加一个方法：在遍历的过程中，可以添加元素
        ListIterator<String> it=list.listIterator();
        while (it.hasNext()){
            String str=it.next();
            if("Hello".equals(str))
                it.add("Java");
        }
        System.out.println(list);
    }
}