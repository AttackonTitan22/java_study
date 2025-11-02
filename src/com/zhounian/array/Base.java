package com.zhounian.array;

public class Base {
    public Base(){
        System.out.println("Base");
    }

    public static void main(String[] args) {
        Base base = new Base();
        Base a = new A();
        System.out.println("是对");
        System.out.println("速度可能是肯定");
        System.out.println("送佛送到能否");
    }
}

class A extends Base{

}
