package com.zhounian.interfacetest.functiontest;

public interface Inter {

    void  show(); //抽象方法

    default void method() { //默认方法
        System.out.println("默认方法被实现了");
        test2();
    }

    static void test(){ //静态方法
        System.out.println("静态方法被实现了");
        test2();
    }

    private static void test2(){
        System.out.println("私有方法被实现了");
    }
}
