package com.zhounian.ui.test;

import java.util.Random;

public class Test {
    public static void main(String[] args) {

        int[] temp={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        Random r=new Random();

        for (int i = 0; i < temp.length; i++) {
            int index=r.nextInt(temp.length);

            int t=temp[i];
            temp[i]=temp[index];
            temp[index]=t;

        }
        for(int ele:temp)
            System.out.print(ele+" ");
        System.out.println();
        int [][] arry=new int[4][4];
        for (int i = 0; i < temp.length; i++) {
                arry[i/4][i%4]=temp[i];
        }
        for(int[] e:arry)
        {
            for (int d:e)
                System.out.print(d+" ");
            System.out.println();
        }
    }


}
