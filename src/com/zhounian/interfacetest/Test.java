package com.zhounian.interfacetest;

public class Test implements Animal{
    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void travel() {
        System.out.println("travel");
    }

    public static void main(String[] args) {
        Test test=new Test();
        test.eat();
        test.travel();
    }
}
