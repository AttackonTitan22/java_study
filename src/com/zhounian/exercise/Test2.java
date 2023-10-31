package com.zhounian.exercise;

import java.util.Random;

public class Test2 {
    //奖池抽奖
    public static void main(String[] args) {
        int[] arr={2,588,888,1000,10000};
        Random r=new Random();
        for(int i=0;i<arr.length;i++)
        {
            int index=r.nextInt(arr.length);
            System.out.println(index);
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        for(int ele:arr)
            System.out.println(ele);
    }
}
