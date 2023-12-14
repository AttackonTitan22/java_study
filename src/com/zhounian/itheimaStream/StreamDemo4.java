package com.zhounian.itheimaStream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo4 {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"张三丰-男-100","张无忌-男-23","赵敏-女-25","周芷若-女-19","谢广坤-男-24","张伟-男-31","周芷若-女-19");

        //收集为List集合
        List<String> newList = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toList());
        System.out.println(newList);

        //收集为set集合
        Set<String> newList2 = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toSet());
        System.out.println(newList2);

        //收集为Map集合
//        Map<String, Integer> newList3 = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toMap(new Function<String, String>() {
//            @Override
//            public String apply(String s) {
//                return s.split("-")[0];
//            }
//        }, new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return Integer.parseInt(s.split("-")[2]) ;
//            }
//        }));

        Map<String, Integer> newList3 = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toMap((String s) ->
                s.split("-")[0], (String s) -> Integer.parseInt(s.split("-")[2])));

        System.out.println(newList3);

    }
}
