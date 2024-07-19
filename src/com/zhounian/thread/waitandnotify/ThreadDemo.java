package com.zhounian.thread.waitandnotify;

public class ThreadDemo {
    public static void main(String[] args) {
        Cook cook = new Cook("厨师");
        Foodie foodie = new Foodie("吃货");

        cook.start();
        foodie.start();

    }
}
