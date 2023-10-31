package com.zhounian.javastring;

public class StringbuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("sdsdf").append("dhkf ");

        System.out.println(sb);

        System.out.println(sb.reverse());

        String str = sb.toString();

        System.out.println(str);
    }
}
