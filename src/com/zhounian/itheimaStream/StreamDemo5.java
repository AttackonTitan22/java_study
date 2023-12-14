package com.zhounian.itheimaStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo5 {

    public static void main(String[] args) {


        //过滤奇数
        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);

        list.stream().filter(s->s%2==0).forEach(s-> System.out.println(s));

        //保留年龄大于等于24岁的人，并将结果收集到Map集合中，姓名为键，年龄为值
        ArrayList<String> strList = new ArrayList<>();

        Collections.addAll(strList,"zhangsan,23","lisi,24","wangwu,25");

        Map<String, Integer> map = strList.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));

        System.out.println(map);

        //实例
        ArrayList<String> manActor = new ArrayList<>();

        Collections.addAll(manActor,"张三,23","李四西,24","王五士,25","杨东彭,65","孟城易,35","柯武,24");

        ArrayList<String> womanActor = new ArrayList<>();

        Collections.addAll(womanActor,"杨丽,23","杨欣叶,24","周海媚,31","张芝先,25","黄何雨,35","杨舒歌,24");

        Stream<String> man = manActor.stream()
                .filter(s -> s.split(",")[0].length() == 3)
                .limit(2);

        Stream<String> woman = womanActor.stream()
                .filter(s -> s.split(",")[0].startsWith("杨"))
                .skip(1);

//        List<Actor> actorList = Stream.concat(man, woman)
//                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
//                .collect(Collectors.toList());

        List<Actor> actorList = Stream.concat(man, woman)
                .map(new Function<String, Actor>() {
                    @Override
                    public Actor apply(String s) {
                        String name=s.split(",")[0];
                        Integer age =Integer.parseInt(s.split(",")[1]);
                        Actor actor = new Actor(name,age);
                        return actor;
                    }
                })
                .collect(Collectors.toList());

        System.out.println(actorList);
    }

}

class Actor {
    private String name;
    private Integer age;

    public Actor(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(Integer age) {
        this.age = age;


    }
}
