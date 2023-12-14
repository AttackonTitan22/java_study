package com.zhounian.MyReflect;


import java.lang.reflect.Field;
import java.util.Arrays;

//反射获取成员变量
public class MyReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {


        Class clazz = Class.forName("com.zhounian.MyReflect.Student");


        //获取所有的成员变量
        Field[] dfs1 = clazz.getDeclaredFields();
        System.out.println("获取所有的成员变量");
        Arrays.stream(dfs1).forEach(System.out::println);

        //获取公共的成员变量
        Field[] dfs2 = clazz.getFields();
        System.out.println("获取公共的成员变量");
        Arrays.stream(dfs2).forEach(System.out::println);

        //获取单个的成员变量
        Field name = clazz.getDeclaredField("name");
        System.out.println("获取单个的成员变量");
        System.out.println(name);

        //获取访问修饰符
        int modifiers = name.getModifiers();
        System.out.println("获取访问修饰符");
        System.out.println(modifiers);

        //获取成员变量的名字
        String n = name.getName();
        System.out.println("获取成员变量的名字");
        System.out.println(n);

        //获取成员变量的数据类型
        Class type = name.getType();
        System.out.println("获取成员变量的数据类型");
        System.out.println(type);

        //获取成员变量记录的值，需要给他指定是哪一个对象的
        Student student = new Student("张三", 23, "男");
        name.setAccessible(true);
        Object value = name.get(student);
        Object value2 = name.get(new Student("李四", 23, "女"));
        System.out.println("获取成员变量记录的值，需要给他指定是哪一个对象的");
        System.out.println(value);
        System.out.println(value2);

        //修改对象里面的记录，需要指定需要修改的对象
        name.set(student,"李四");
        System.out.println("修改对象里面的记录，需要指定需要修改的对象");
        System.out.println(student);

    }
}
