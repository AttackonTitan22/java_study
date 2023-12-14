package com.zhounian.MyReflect;

public class MyReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {

        /*
        * 获取class对象的三种方式：
        * 1.Class.forName("全类名")
        * 2.类名.class
        * 3.对象.getClass()
        * */

        //第一种方式
        //全类名：包名+类名
        //最为常用
        Class clazz = Class.forName("com.zhounian.MyReflect.Student");

        System.out.println(clazz);

        //第二种方式：
        //一般更多的是当作参数进行传递
        Class clazz2= Student.class;

        System.out.println(clazz==clazz2);

        //第三种方式：
        //当我们已经有过这个类的对象时，才可以使用
        Student s = new Student();
        Class clazz3 = s.getClass();


        System.out.println(clazz3==clazz2);
    }
}
