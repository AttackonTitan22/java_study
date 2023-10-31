package com.zhounian.SerializableDemo;

import java.io.*;

public class SerializableTest2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writePerson();
        readPerson();
    }

    //从文件中读取Person对象
    public static void readPerson() throws IOException, ClassNotFoundException {
        //创建反序列化流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Person.txt"));
        //从文件中读取对象
        Person obj = (Person)ois.readObject();
        System.out.println(obj);
        System.out.println(obj.name+obj.age);
        //释放资源
        ois.close();
    }

    //向文件中写Person对象
    public static void writePerson() throws IOException {
        //创建序列化流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Person.txt"));
        //向文件中写Person对象
        oos.writeObject(new Person("张三丰", 100));
        //关流
        oos.close();
    }
}

class Person implements Serializable{
    String name;
    int age;
    Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
}
