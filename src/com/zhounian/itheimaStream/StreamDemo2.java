package com.zhounian.itheimaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        //单列集合
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"a","df","s","ji","ssn","sdsgd");

        list.stream().forEach(value-> System.out.println(value));


        //双列集合
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("A","a");
        hashMap.put("B","b");
        hashMap.put("C","c");
        hashMap.put("D","d");
        hashMap.put("E","e");

        hashMap.entrySet().stream().forEach(s-> System.out.println(s));

        hashMap.keySet().stream().forEach(s -> System.out.println(s+"=>"+hashMap.get(s)));

        //数组，需要Arrays工具类
        String[] arr={"a","df","s","ji","ssn","sdsgd"};

        Arrays.stream(arr).forEach(s -> System.out.println(s));


        Stream.of("a","df","s","ji","ssn","sdsgd").forEach(s-> System.out.println(s));

        Stream.of(1,2,3,4,5).forEach(System.out::println);

        //stream接口也可以传入数组，但是数组类型必须是引用类型

        Stream.of(arr).forEach(str-> System.out.println(str));

        //基本数据类型，不可以
        int [] intArr={1,2,3};
        Stream.of(intArr).forEach(num-> System.out.println(num));//会输出地址值，是把这个数组作为一个对象来输出流

    }
}
