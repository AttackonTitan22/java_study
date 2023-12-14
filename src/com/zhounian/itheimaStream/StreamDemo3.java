package com.zhounian.itheimaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;


//流的中间方法，filter、map、limit、skip
public class StreamDemo3 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"张三丰","张无忌","赵敏","周芷若","谢广坤","张伟","周芷若");

        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("张");
            }
        }).forEach(ele-> System.out.println(ele));

        list.stream().filter((String s) ->{
                return s.startsWith("张");
            }
        ).forEach(ele-> System.out.println(ele));

        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length()==2).forEach(s -> System.out.println(s));

        //stream获取的流只可使用一次
        Stream<String> stream = list.stream().filter(s -> s.startsWith("张"));

        stream.forEach(s -> System.out.println(s));

//        try {
//            stream.filter(s -> s.length()==2);
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("流使用了两次");
//        }


        list.stream().limit(2).forEach(s -> System.out.println(s));

        list.stream().skip(2).forEach(s -> System.out.println(s));


        System.out.println("------------------------------");
        //流的去重，distinct   依赖(HashCode和equals方法)
        list.stream().distinct().forEach(s -> System.out.println(s));

        System.out.println("-----------------------");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"周年");
        Stream.concat(list.stream(),list2.stream()).forEach(s -> System.out.println(s));

        //类型转换

        ArrayList<String> list3 = new ArrayList<>();

        Collections.addAll(list3,"张三丰-100","张无忌-23","赵敏-25","周芷若-19","谢广坤-24","张伟-31","周芷若-19");

        //string -> int
        //Function<String, Integer>()  表示String  -> Integer
        //第一个类型：流中原本的数据类型
        //第二种数据类型：要转成之后的类型

        //apply的形参s：依次表示流里面的每一个数据
        //返回值：表示转换之后的数据
        list3.stream().map(new Function<String,Integer>() {
            @Override
            public Integer apply(String s) {
                String[] arr = s.split("-");
                String i = arr[1];
                int anInt = Integer.parseInt(i);
                return anInt;
            }
        }).forEach(s-> System.out.println(s));

        list3.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(s-> System.out.println(s));

        //终结方法

        list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        long count = list.stream().count();
        System.out.println(count);


        //空参构造，默认返回Object类型的数组
        Object[] objects = list.stream().toArray();
        System.out.println(Arrays.toString(objects));



        //toArray方法的参数的作用：复杂创建一个指定类型的数组
        //toArray方法的底层，会一次得到流里面的每一个数据，并把数据放到数组当中
        //toArray方法的返回值：是一个装着流里面所有数据的数组

        //String为自定义指定类型
        String[] i = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(i);
        System.out.println(Arrays.toString(i));

    }
}
