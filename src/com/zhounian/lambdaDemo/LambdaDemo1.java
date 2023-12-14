package com.zhounian.lambdaDemo;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo1 {
    public static void main(String[] args) {

        Integer[] arr={2,3,1,5,6,7,8,4,9};

//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1-o2;
//            }
//        });
        System.out.println(Arrays.toString(arr));

        //Lambda 完整格式
        Arrays.sort(arr, (Integer o1, Integer o2)-> {
                return o1-o2;
            }
        );
        System.out.println(Arrays.toString(arr));

        //Lambda 简写格式
        //小括号：数据类型可以省略，如果参数只有一个，小括号还可以省略
        //大括号：如果方法体只有一行，return，分号，大括号都可以省略
        Arrays.sort(arr, (Integer o1, Integer o2)->o2-o1);

        System.out.println(Arrays.toString(arr));
    }
}
