package com.zhounian.thread.threadcase3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        MyCallable myCallable = new MyCallable();

        FutureTask<Integer> futureTask = new FutureTask<>(myCallable);

        Thread t1 = new Thread(futureTask);

        t1.start();

        Integer result =futureTask.get();
        System.out.println(result);
    }
}
