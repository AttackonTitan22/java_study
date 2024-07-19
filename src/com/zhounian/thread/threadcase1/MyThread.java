package com.zhounian.thread.threadcase1;

public class MyThread extends Thread{

    /**
     * 重写run方法
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+"执行了"+i);
        }

    }
}
