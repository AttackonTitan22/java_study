package com.zhounian.interfacetest.adapter;

public class Interimpl extends InterfaceAdapter{

    @Override
    public void method5() {
        System.out.println("只用method5方法");
    }

    public static void main(String[] args) {
        Inter i=new Interimpl();
        i.method5();
    }
}
