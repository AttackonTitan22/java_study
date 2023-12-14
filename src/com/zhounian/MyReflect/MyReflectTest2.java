package com.zhounian.MyReflect;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class MyReflectTest2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //反射可以跟配置文件结合的方式，动态的创建对象，并调用方法

        Properties prop = new Properties();

        //创建IO流
        FileInputStream fileInputStream = new FileInputStream("src/com/zhounian/MyReflect/prop.properties");
        prop.load(fileInputStream);
        fileInputStream.close();

        System.out.println(prop);

        String classname = (String) prop.get("classname");
        String method = (String) prop.get("method");

        //利用反射创建对象并运行
        Class clazz = Class.forName(classname);
        Constructor con = clazz.getDeclaredConstructor(String.class, Integer.class);
        con.setAccessible(true);
        Object obj = con.newInstance("张三",23);

        Method method1 = clazz.getDeclaredMethod(method);
        String result = (String) method1.invoke(obj);
        System.out.println(result);
    }
}
