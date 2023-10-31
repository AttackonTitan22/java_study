package com.zhounian.extenddemo;

public class ExtendDemo4 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Penguin QQ = new Penguin("小冰",10086);
        //调用一个有参构造方法
        QQ.Eat();
        QQ.sleep();
        QQ.introduction();
    }
}
/**建立一个公共动物父类*/
class ANimal {
    private String name;
    private int id;
    /*由于name和id都是私有的，所以子类不能直接继承，
    需要通过有参构造函数进行继承*/
    public ANimal(String myname,int myid) {
        name = myname;
        id = myid;
    }
    public void Eat() {
        System.out.println(name+"正在吃");
    }
    public void sleep() {
        System.out.println(name+"正在睡");
    }
    public void introduction() {
        System.out.println("大家好！我是"  +id+"号"+name +".");
    }

}
 class Penguin extends ANimal {
    public Penguin(String myname,int myid) {
        super(myname,myid); // 声明继承父类中的两个属性
    }
}
