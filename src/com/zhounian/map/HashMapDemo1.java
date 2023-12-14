package com.zhounian.map;

import java.util.HashMap;
import java.util.Objects;

public class HashMapDemo1 {
    public static void main(String[] args) {

        HashMap<Student, String> hashMap = new HashMap<>();

        hashMap.put(new Student("周年",23),"四川乐山");
        hashMap.put(new Student("周年",23),"广东深圳");
        hashMap.put(new Student("张三",21),"湖北武汉");
        hashMap.put(new Student("李四",19),"江西南昌");

        hashMap.forEach((Student student1,String location)->{
            System.out.println(student1.toString()+":"+location);

        });
    }
}

class Student{
    String name;
    int age;


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
