package com.zhounian.mydynamicproxy;

public class Test {
    public static void main(String[] args) {

        BigStar bigStar = new BigStar("鸡哥");

        Star proxy = ProxyUtil.createProxy(bigStar);
        proxy.sing("鸡你太美");
    }
}
