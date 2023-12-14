package com.zhounian.MyReflect;

import java.io.IOException;

public class Student {
    private String name;
    private Integer age;
    public String gender;

    public Student() {
    }

    private Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, Integer age,String gender) {
        this.name = name;
        this.age = age;
        this.gender=gender;
    }

    protected Student(String name) {
        this.name = name;
    }

    private Student( Integer age) {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void sleep(){
        System.out.println("睡觉");
    }

    public String sleep2(){
        System.out.println("睡觉");
        return "睡觉奥";
    }

    private void eat(String something) throws IOException,ClassNotFoundException,NoSuchFieldException {
        System.out.println("在吃"+something);
    }

    private String eat(String something,Integer i){
        System.out.println("在吃"+something+i);
        return "嘻嘻";
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
