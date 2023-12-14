package com.zhounian.functionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//引用构造方法  类名::new
public class FunctionDemo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"张三丰,100","张无忌,23","赵敏,25"
                ,"周芷若,19","谢广坤,24","张伟,31");
        //匿名内部类书写
        List<Actor> actorList = list.stream().map(new Function<String, Actor>() {
            @Override
            public Actor apply(String s) {
                String[] split = s.split(",");
                String name = split[0];
                int age = Integer.parseInt(split[1]);
                return new Actor(name, age);
            }
        }).collect(Collectors.toList());
        System.out.println(actorList);
        //方法引用构造函数

        List<Actor> actorList1 = list.stream()
                .map(Actor::new)
                .collect(Collectors.toList());

        System.out.println("方法引用构造函数");
        System.out.println(actorList1);

    }
}

class Actor {
    private String name;
    private Integer age;

    public Actor(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Actor(String s) {
        String[] split = s.split(",");
        this.name = split[0];
        this.age = Integer.parseInt(split[1]);
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
