package com.zhounian.thread.waitandnotify2;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread{

    ArrayBlockingQueue<String> arrayBlockingQueue;

    public Cook(ArrayBlockingQueue<String> arrayBlockingQueue) {
        this.arrayBlockingQueue = arrayBlockingQueue;
    }

    @Override
    public void run() {
        while (true){
            try {
                arrayBlockingQueue.put("面条");
                System.out.println(getName()+ "做了一份面条");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
