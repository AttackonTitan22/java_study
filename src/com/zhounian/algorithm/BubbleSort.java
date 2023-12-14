package com.zhounian.algorithm;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr=new int[20];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(150);
            System.out.print(arr[i]+" ");
        }
        Bubblesort(arr);
        System.out.println();
        for(int e:arr)
            System.out.print(e+" ");
    }

    private static void Bubblesort(int[] arr) {
        for (int j = 1; j < arr.length; j++) {
            boolean flag=true;
            for (int i = 0; i < arr.length-j; i++) {
                if(arr[i]>arr[i+1])
                {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    flag=false;
                }

            }
            if(flag)
                break;
        }

    }
}
