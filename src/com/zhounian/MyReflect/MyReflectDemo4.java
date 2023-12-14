package com.zhounian.MyReflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

//反射获取成员方法
public class MyReflectDemo4 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Class clazz = Class.forName("com.zhounian.MyReflect.Student");

        //获取所有成员方法,不能获取父类的，但是可以获取本类中私有的方法
        Method[] dms1 = clazz.getDeclaredMethods();
        System.out.println("获取所有成员方法,不能获取父类的，但是可以获取本类中私有的方法");
        Arrays.stream(dms1).forEach(System.out::println);

        //获取所有成员方法，（包含父类中所有的方法）
        Method[] methods = clazz.getMethods();
        System.out.println("获取所有成员方法，（包含父类中所有的方法）");
        Arrays.stream(methods).forEach(System.out::println);

        //获取指定的单个成员方法
        Method eat = clazz.getDeclaredMethod("eat", String.class);
        System.out.println("获取指定的单个成员方法");
        System.out.println(eat);

        //获取指定的单个方法，不能获取到private方法
        Method sleep = clazz.getMethod("sleep");
        System.out.println("获取指定的单个方法，不能获取到private方法");
        System.out.println(sleep);

        //获取权限修饰符
        int modifiers = eat.getModifiers();
        int modifiers1 = sleep.getModifiers();
        System.out.println("获取方法对象的权限修饰符");
        System.out.println(modifiers);
        System.out.println(modifiers1);

        //获取方法的名字
        String name = eat.getName();
        String name1 = sleep.getName();
        System.out.println("获取方法的名字");
        System.out.println(name+"\n"+name1);

        //获取方法的形参
        Parameter[] parameters = eat.getParameters();
        System.out.println("获取方法的形参");
        Arrays.stream(parameters).forEach(System.out::println);

        //获取方法的异常
        Class[] exceptionTypes = eat.getExceptionTypes();
        System.out.println("获取方法的异常");
        Arrays.stream(exceptionTypes).forEach(System.out::println);

        //获取方法的返回值
        //首先要方法执行起来
        //方法运行
        /*
        Method类中用于创建对象的方法
        Object invoke(Object obj,Object ... args):运行方法
        参数一：用obj对象调用该方法
        参数二：调用方法的传递的参数（如果没有就不写）
        返回值：方法的返回值（没有就不写）
        * */
        //先获取private的方法
        Method eat1 = clazz.getDeclaredMethod("eat", String.class, Integer.class);
        //设置访问权限
        eat1.setAccessible(true);
        Object xixi = eat1.invoke(new Student(), "橘子", 7);
        System.out.println(xixi);
    }
}
