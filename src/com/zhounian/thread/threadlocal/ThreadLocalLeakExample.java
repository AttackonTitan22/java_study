package com.zhounian.thread.threadlocal;

public class ThreadLocalLeakExample {
    private static final ThreadLocal<Object> threadLocal = new ThreadLocal<>();

    public static void set(Object value) {
        threadLocal.set(value);
    }

    public static void main(String[] args) throws InterruptedException {
        set(new Object()); // 设置值，与 ThreadLocalMap 的 Entry 强关联
        
        // 以下代码模拟 ThreadLocal 对象被垃圾回收
        // ThreadLocal 对象实际上仍然存在，因为 threadLocal 变量还在被使用
        // 但为了演示，我们手动清除 threadLocal 引用，模拟 ThreadLocal 对象不再被使用的情形
//        threadLocal = null;

        System.gc(); // 提示 JVM 进行垃圾回收，弱引用的 ThreadLocal 对象可能被回收
        
        // 在这里，原本的 ThreadLocal 对象可能已被回收，但值还在 ThreadLocalMap 中，
        // 因为 ThreadLocalMap 中的 Entry 强引用着它，除非我们显式地调用 remove 方法。
        
        // 换句话说，即使 ThreadLocal 实例被回收，每个 Thread 还持有其对应的 ThreadLocalMap，
        // 其中的值无法被回收，导致内存泄漏。
    }
}