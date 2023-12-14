package com.zhounian.itheimaStream;

import java.util.ArrayList;

public class StreamDemo1 {
    public static void main(String... args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张伟");

        list.stream()
                .filter(name -> name.startsWith("张"))
                .filter(name -> name.length() == 3)
                .forEach(name -> System.out.println(name));

        list.stream().map(i->i+"abc").forEach(System.out::println);

        System.out.println(list);
    }
}
