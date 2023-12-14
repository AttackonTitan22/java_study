package com.zhounian.functionDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionExample3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("张三丰",100));
        list.add(new Student("张无忌",23));
        list.add(new Student("赵敏",25));
        list.add(new Student("周芷若",19));
        list.add(new Student("谢广坤",24));
        list.add(new Student("张伟",31));

        String[] names = list.stream().map(new FunctionExample3()::StudentToString).toArray(String[]::new);

        System.out.println(Arrays.toString(names));


    }
    public String StudentToString(Student student){
        return student.getName()+"-"+student.getAge();
    }

}
