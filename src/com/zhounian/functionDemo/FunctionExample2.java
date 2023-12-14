package com.zhounian.functionDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionExample2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("张三丰",100));
        list.add(new Student("张无忌",23));
        list.add(new Student("赵敏",25));
        list.add(new Student("周芷若",19));
        list.add(new Student("谢广坤",24));
        list.add(new Student("张伟",31));

        //只获取姓名并放到数组当中（方法引用）用的自己定义的方法
        String[] name = list.stream().map(new FunctionExample2()::StudentToName).toArray(String[]::new);
        System.out.println(Arrays.toString(name));

        //类名::成员方法
        String[] name2 = list.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(name2));

        //采用lambda
        String[] name3 = list.stream().map(s->s.getName()).toArray(String[]::new);
        System.out.println(Arrays.toString(name3));

    }

    public String StudentToName(Student student){
        return student.getName();
    }
}
