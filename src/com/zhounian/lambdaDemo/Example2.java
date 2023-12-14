package com.zhounian.lambdaDemo;

public class Example2 {
    public static void main(String[] args) {
        //猴子吃桃子，一堆猴子每天吃桃子总数的一半，再多吃一个，到第十天的时候还剩一个，还没有吃。
        //求之前任何某一天的桃子还有多少个

        System.out.println(getCount(1));
    }

    private static int getCount(int i) {
        if(i<=0||i>=11)
            return -1;
        if(i==10)
            return 1;
        return (getCount(i+1)+1)*2;
    }
}
