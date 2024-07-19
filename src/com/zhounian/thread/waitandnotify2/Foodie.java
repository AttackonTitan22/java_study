package com.zhounian.thread.waitandnotify2;


import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread{

    ArrayBlockingQueue<String> arrayBlockingQueue;

    public Foodie(ArrayBlockingQueue<String> arrayBlockingQueue) {
        this.arrayBlockingQueue = arrayBlockingQueue;
    }

    @Override
    public void run() {
        while (true){
            try {
                arrayBlockingQueue.take();
                System.out.println(getName()+ "吃了一份面条");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
