package com.zhounian.HashSetDemo;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Student s1=new Student("zhangsan",23);
        Student s2=new Student("lisi",24);
        Student s3=new Student("wangwu",25);

        TreeSet<Student> ts=new TreeSet<>();

        ts.add(s3);
        ts.add(s2);
        ts.add(s1);
        //排序的底层是红黑树

        //第一种排序方式：默认排序/自然排序，javabean类实现comparable接口指定比较规则
        System.out.println(ts);

        //第二种排序方式：比较器排序
        TreeSet<String> ts2=new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i=o1.length()-o2.length();
                i=(i==0?o1.compareTo(o2):i);
                return i;
            }
        });
        //还可以写成lambda表达式

        ts2.add("c");
        ts2.add("ab");
        ts2.add("df");
        ts2.add("qwer");

        System.out.println(ts2);
    }
}
