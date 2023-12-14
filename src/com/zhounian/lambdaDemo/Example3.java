package com.zhounian.lambdaDemo;

public class Example3 {
    public static void main(String[] args) {
        //爬楼梯
        //一次可以选择爬一层或者两层，爬到20层有多少种爬法

        System.out.println(getCount(20));
        System.out.println(getCount2(20));
    }

    private static int getCount(int i) {
        int a=1;
        int b=2;
        int c=0;
        if(i==1)
            return a;
        if(i==2)
            return b;
        for (int n = 3; n <= i; n++) {
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }

    //爬楼梯
    //一次可以选择爬一层或者两层或者三层，爬到20层有多少种爬法
    private static int getCount2(int i) {
        int a=1;
        int b=2;
        int c=4;
        int d=0;
        if(i==1)
            return a;
        if(i==2)
            return b;
        if(i==3)
            return c;
        for (int n = 4; n <= i; n++) {
            d=a+b+c;
            a=b;
            b=c;
            c=d;
        }
        return d;
    }

}
