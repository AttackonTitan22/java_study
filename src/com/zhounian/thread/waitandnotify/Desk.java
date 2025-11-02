package com.zhounian.thread.waitandnotify;

import java.util.concurrent.locks.Lock;

public class Desk  {


    /**
     * 是否有面条
     */
    public static int foodFlag = 0;

    //总个数
    public static int count = 2;

    public static int size=count;

    /**
     * 锁对象
     */
    public static Object lock =new Object();
}
