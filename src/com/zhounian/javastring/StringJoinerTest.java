package com.zhounian.javastring;

import java.util.StringJoiner;

public class StringJoinerTest {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",","[","]");

        sj.add("a").add("b").add("c");

        System.out.println(sj.toString());


    }
}
