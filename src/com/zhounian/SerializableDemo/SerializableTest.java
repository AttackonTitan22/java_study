package com.zhounian.SerializableDemo;

import java.io.*;

public class SerializableTest  implements Serializable {
    public transient int transient_element=1;
    public int element=1;
    SerializableTest(){
        System.out.println("SerializableTest已被创建");
    }
    public static void main(String[] args) {
        SerializableTest obj = new SerializableTest();
        System.out.println(obj);
        System.out.println(obj.transient_element);
        System.out.println(obj.element);
        try {
            FileOutputStream fileOut = new FileOutputStream("object.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        SerializableTest obj2 = null;
        try {
            FileInputStream fileIn = new FileInputStream("object.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            //反序列化以后不会被重新构造类
           // System.out.println(in.readObject().getClass());
            obj2 = (SerializableTest) in.readObject();
            System.out.println(obj2);
            System.out.println(obj2.transient_element);
            System.out.println(obj2.element);
            in.close();
            fileIn.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


