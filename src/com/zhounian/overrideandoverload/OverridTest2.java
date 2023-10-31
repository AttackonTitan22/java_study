package com.zhounian.overrideandoverload;

public class OverridTest2 {
    public static void main(String[] args) {
        System.out.println("Polymorghpic Test");
        Animal1 a = new Dog1();
        Animal1 b = new Dog1("smith", 5);
        // 子类的非静态方法与变量覆盖父类
        a.getInfo();
        // 子类通过super调用父类的非静态成员方法和变量
        a.getSuperInfo();
        // 子类的静态方法被父类隐藏
        a.hello();
        b.getInfo();
        b.hello();
    }
}
class Animal1 {
    String name;
    int age;
    public Animal1() {
        name = "alex";
        age = 1;
    }
    public Animal1(String nm, int ag) {
        name = nm;
        age = ag;
    }
    public void getInfo() {
        System.out.print(name + "'s age is " + age + '\n');
    }
    public void getSuperInfo() {}
    public static void hello() {
        System.out.println("Greeting from Animal");
    }
}
class Dog1 extends Animal1 {
    String name;
    int age;
    public Dog1() {
        name = "prter";
        age = 3;
    }
    public Dog1(String nm, int ag) {
        super(nm, ag);
    }
    public void getInfo() {
        System.out.print(name + "'s age is " + age + '\n');
    }
    // 通过super显式调用父类的非静态成员方法
    public void getSuperInfo() {
        super.getInfo();
    }
    public static void hello() {
        System.out.println("Greeting from Dog");
    }
}