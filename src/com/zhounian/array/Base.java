package com.zhounian.array;

public class Base {
    public Base(){
        System.out.println("Base");
    }

    public static void main(String[] args) {
        Base base = new Base();
        Base a = new A();
        System.out.println("速度可能");
        System.out.println("存在于01");
        System.out.println("存在与master");
        System.out.println("8 master");
    }
}

class A extends Base{

}
