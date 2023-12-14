package com.zhounian.map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {


        TreeMap<Student, String> studentStringTreeMap = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
            //按年龄来排序， 年龄一样看姓名字母
                int i = o1.getAge() - o2.getAge();
                i=i==0?o1.getName().compareTo(o2.getName()):i;

                return i;
            }
        });

        studentStringTreeMap.put(new Student("zhangsan",23),"江苏");
        studentStringTreeMap.put(new Student("lisi",24),"天津");
        studentStringTreeMap.put(new Student("wangwu",23),"北京");

        System.out.println(studentStringTreeMap);
    }
}
