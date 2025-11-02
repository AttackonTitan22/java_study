package com.zhounian.thread.waitandnotify;

public class Foodie extends Thread{

    public Foodie(String name) {
        this.setName(name);
    }

    @Override
    public void run() {

        /**
         * 1.循环
         * 2.同步代码块
         * 3.判断共享数据是否到达末尾（到末尾）
         * 4.判断共享数据是否到达末尾（没有到末尾，执行核心代码）
         */
        while (true){
            synchronized (Desk.lock){
                if(Desk.count==0){
                    break;
                }else {
                    if(Desk.foodFlag==0){
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else {
                        Desk.count--;
                        System.out.println(getName()+ "吃了一份面条，还要吃"+Desk.count+"份面条");
                        Desk.foodFlag=0;
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("吃货吃完了"+Desk.size+"份面条后，满意的离开！");
    }
}
