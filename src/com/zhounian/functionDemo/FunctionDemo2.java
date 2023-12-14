package com.zhounian.functionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

//引用静态方法
//静态方法引用   类名::静态方法
public class FunctionDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"1","2","3","4","5");

        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        }).forEach(System.out::println);

        list.stream().map(Integer::parseInt).forEach(System.out::println);
    }
}
