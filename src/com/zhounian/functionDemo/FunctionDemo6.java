package com.zhounian.functionDemo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

//数据类型[]::new
public class FunctionDemo6 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list,1,2,3,4,5);

        Integer[] array = list.stream().toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                return new Integer[value];
            }
        });
        System.out.println(Arrays.toString(array));

        System.out.println("方法引用");
        Integer[] array2 = list.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(array2));

    }
}
