package com.zhounian.interfacetest;

public interface Sports {
    String name="Sports接口里面的成员变量，默认为public static final";
    public void setHomeTeam(String name);
    public void setVisitingTeam(String name);
    //这个是默认方法
    default String get(String aa){
        System.out.println("我是jdk1.8默认实现方法...");
        return "";
    }
    //这个是静态方法
    static void staticmethod(){
        System.out.println("我是静态方法");
    }
}
