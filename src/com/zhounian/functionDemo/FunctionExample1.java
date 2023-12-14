package com.zhounian.functionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


//集合中存储一些字符串的数据，比如：张三，23
//收集到Student类型的数组当中（使用方法引用完成）
public class FunctionExample1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"张三丰,100","张无忌,23","赵敏,25"
                ,"周芷若,19","谢广坤,24","张伟,31");

        Student[] students = list.stream().map(Student::new).toArray(Student[]::new);

        Arrays.stream(students).forEach(System.out::print);
        System.out.println();

        System.out.println(Arrays.toString(students));
    }

}



class Student{
    private String name;
    private Integer age;
    private String gender;

    public Student() {
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Student(String s) {
        this.name = s.split(",")[0];
        this.age = Integer.parseInt(s.split(",")[1]);
    }

    public void setGender(String gender){
        this.gender=gender;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * 获取
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
