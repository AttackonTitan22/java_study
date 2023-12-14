package com.zhounian.MyReflect;


/*对于任意一个对象，都可以把所有的字段名和值，保存到文件中
*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class MyReflectTest1 {
    public static void main(String[] args) throws IOException, IllegalAccessException {

        Student student = new Student("小A", 23, "男");

        saveObject(student);


    }

    //在此之前是不清楚所得到的类的内部到底有哪些变量和方法的
    public static void saveObject(Object obj) throws IOException, IllegalAccessException {

        //1.获取字节码文件的对象
        Class clazz = obj.getClass();

        //2.创建IO流
        BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
        Field[] fields = clazz.getDeclaredFields();
        for(Field field:fields){
            //获取所有成员变量的访问权限
            field.setAccessible(true);
            String name = field.getName();
            Object value = field.get(obj);

            //写出数据
            bw.write(name+"="+value);
            bw.newLine();
        }
        bw.close();
    }

}
