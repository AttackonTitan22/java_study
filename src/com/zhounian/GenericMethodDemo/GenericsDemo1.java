package com.zhounian.GenericMethodDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo1 {
    public static void main(String[] args) {
        //没有泛型的时候，集合如何存储数据
        //结论：
        //如果我们没有给集合指定类型，默认认为所有的数据类型都是Object类型
        //此时可以王集合添加任意的数据类型
        //带来一个坏处：我们在获取数据的时候，无法使用他的特有行为和方法

        //此时推出了泛型，可以在添加数据的时候就把类型进行统一
        //而且我们在获取数据的时候，也省的强转，非常的方便

        ArrayList<String> list=new ArrayList<>();

        //list.add(123);
        list.add("aaa");

        Iterator<String> it =list.iterator();
        while (it.hasNext()){
            String str=it.next();
            //多态的弊端是不能访问子类的特有功能
            System.out.println(str);
        }
    }
}
