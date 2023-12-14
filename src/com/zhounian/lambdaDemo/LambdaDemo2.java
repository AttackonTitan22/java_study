package com.zhounian.lambdaDemo;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo2 {
    public static void main(String[] args) {
        String[] str={"aa","aaa","a","aaaa"};

//        Arrays.sort(str, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();
//            }
//        });
//        System.out.println(Arrays.toString(str));

        Arrays.sort(str, (String o1, String o2)-> { return o1.length()-o2.length(); });
        System.out.println(Arrays.toString(str));

        Arrays.sort(str,(o1,o2)-> o2.length()-o1.length());
        System.out.println(Arrays.toString(str));
    }
}
