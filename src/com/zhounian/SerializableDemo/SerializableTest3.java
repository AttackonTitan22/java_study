package com.zhounian.SerializableDemo;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SerializableTest3 {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        List<Student> list = new ArrayList<>();
        list.add(new Student("student1",10));
        list.add(new Student("student2",20));

        FileOutputStream f=new FileOutputStream("list.txt");
        ObjectOutputStream oos=new ObjectOutputStream(f);
        oos.writeObject(list);
        oos.close();
        f.close();

        FileInputStream fis=new FileInputStream("list.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        List<Student> get=(List<Student>) ois.readObject();
        ois.close();
        fis.close();
        Iterator<Student> iterator = get.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        for(Student it:get)
            System.out.println(it.name+it.age);

    }
}

class Student implements Serializable{
    String name;
    int age;
    Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
}