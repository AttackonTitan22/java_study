package com.zhounian.enumtest;

public enum Color {
    RED("red"),
    GREEN("green"),
    BLUE("blue")
    ;

    // 构造函数
//    private Color()
//    {
//        System.out.println("Constructor called for : " + this.toString());
//    }

    private Color(String color)
    {
        System.out.println("Constructor called for : " + color);
    }

    public void colorInfo()
    {
        System.out.println("Universal Color");
    }
}

