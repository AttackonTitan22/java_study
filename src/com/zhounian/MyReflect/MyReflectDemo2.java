package com.zhounian.MyReflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;
import java.util.Arrays;

//反射获取构造方法
public class MyReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class clazz = Class.forName("com.zhounian.MyReflect.Student");

        //获取公共的构造方法
        Constructor[] cons1 = clazz.getConstructors();
        System.out.println("获取公共的构造方法");
        Arrays.stream(cons1).forEach(System.out::println);

        //获取所有的构造方法
        Constructor[] cons2 = clazz.getDeclaredConstructors();
        System.out.println("获取所有的构造方法");
        Arrays.stream(cons2).forEach(System.out::println);

        //得到单个构造方法
        Constructor con1 = clazz.getDeclaredConstructor();
        System.out.println("得到无参构造方法");
        System.out.println(con1);

        Constructor con2 = clazz.getDeclaredConstructor(String.class);
        System.out.println("得到有参构造方法protected Student(String name)");
        System.out.println(con2);

        Constructor con3 = clazz.getDeclaredConstructor(Integer.class);
        System.out.println("得到有参构造方法protected Student( Integer age)");
        System.out.println(con3);

        Constructor con4 = clazz.getDeclaredConstructor(String.class,Integer.class);
        System.out.println("得到双参构造方法");
        System.out.println(con4);

        //获取权限符
        int modifiers = con4.getModifiers();
        System.out.println("得到权限符");
        System.out.println(modifiers);

        //获取参数个数、类型等
        int parameterCount = con4.getParameterCount();
        System.out.println("得到参数个数");
        System.out.println(parameterCount);

        Class[] parameterTypes = con4.getParameterTypes();
        System.out.println("得到参数类型");
        Arrays.stream(parameterTypes).forEach(System.out::println);

        Parameter[] parameters = con4.getParameters();
        System.out.println("得到参数");
        Arrays.stream(parameters).forEach(System.out::println);

        //创建对象newInstance
        //暴力反射：临时获取访问权限，临时取消权限校验
        con4.setAccessible(true);
        Student s = (Student) con4.newInstance("张三", 23);
        System.out.println(s);
    }
}
