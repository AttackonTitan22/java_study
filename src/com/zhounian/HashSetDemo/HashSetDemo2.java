package com.zhounian.HashSetDemo;

import java.util.Objects;

public class HashSetDemo2 {
    public static void main(String[] args) {
        /*
        哈希值：
        对象的证书表现形式
        1.如果没有重写hashCode方法，不同对象计算出的哈希值是不同的
        2.如果已经重写hashCode方法，不同的对象只要属性值相同，计算出的哈希值就是一样的
        3.但是在小部分情况下，不同的属性值或者不同的地址值计算出来的哈希值也有可能一样，（哈希冲突）

         */
        Student s1=new Student("zhangsan",23);
        Student s2=new Student("zhangsan",23);

        //如果没有重写hashCode方法，不同对象计算出的哈希值是不同
        //如果已经重写hashCode方法，不同对象计算出的哈希值是相同的
        System.out.println(s1.hashCode());//1967205423  -1461067292
        System.out.println(s2.hashCode());//42121758    -1461067292

        //在小部分情况下，不同属性值或者不同的地址值计算出来的哈希值也有可能一样，（哈希冲突）
        System.out.println("abc".hashCode());//96354

        System.out.println("acD".hashCode());//96354

    }

}

class Student implements Comparable<Student>{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    @Override
    public int compareTo(Student o) {
        int result=this.getAge()-o.getAge();
        return result;
    }
}
