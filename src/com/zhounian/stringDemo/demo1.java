package com.zhounian.stringDemo;

/**
 * 验证字符串常量池
 */
public class demo1 {

/*    public static final String a2 = "abc";
    public static final String abc = "abc";*/
    public static void main(String[] args) {

        demo1 demo1 = new demo1();
        String a1 = "abc";
        String a2 = "abc";
        System.out.println(a1==a2);


    }
}
