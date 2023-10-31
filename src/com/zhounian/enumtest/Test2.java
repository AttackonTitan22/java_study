package com.zhounian.enumtest;

public class Test2 {
    public static void main(String[] args) {
        for (Color_pro c:Color_pro.values()){
            System.out.print(c.getColor() + "、");
        }
    }
}
