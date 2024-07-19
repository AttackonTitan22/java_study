package com.zhounian.thread.volatiledemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 微信搜 JavaGuide 回复"面试突击"即可免费领取个人原创的 Java 面试手册
 *
 * @author Guide哥
 * @date 2022/08/03 13:40
 **/
public class VolatileAtomicityDemo {
    public volatile static int inc = 0;

    /**
     * 很多人会误认为自增操作 inc++ 是原子性的，
     * 实际上，inc++ 其实是一个复合操作，
     * 包括三步：
     * 读取 inc 的值。
     * 对 inc 加 1。
     * 将 inc 的值写回内存。
     *
     * volatile 是无法保证这三个操作是具有原子性的
     */
    public void increase() {
        inc++;
    }

    //使用 synchronized 改进：
/*    public synchronized void increase() {
        inc++;
    }*/

    //使用 AtomicInteger 改进：
/*    public static AtomicInteger inc =new AtomicInteger();

    public void increase() {
        inc.getAndIncrement();
    }*/

    //使用 ReentrantLock 改进
    Lock lock = new ReentrantLock();
/*    public void increase() {
        lock.lock();
        try {
            inc++;
        } finally {
            lock.unlock();
        }
    }*/

    public static void main(String[] args) throws InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        VolatileAtomicityDemo volatileAtomicityDemo = new VolatileAtomicityDemo();
        for (int i = 0; i < 5; i++) {
            threadPool.execute(() -> {
                for (int j = 0; j < 500; j++) {
                    volatileAtomicityDemo.increase();
                }
            });
        }
        // 等待1.5秒，保证上面程序执行完成
        Thread.sleep(1500);
//        System.out.println(inc.get());
        System.out.println(inc);
        threadPool.shutdown();
    }
}
