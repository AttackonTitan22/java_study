package com.zhounian.algorithm;

import java.util.Random;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr=new int[20];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(150);
            System.out.print(arr[i]+" ");
        }
        selecSort(arr);
        System.out.println();
        for(int e:arr)
            System.out.print(e+" ");
        System.out.println();

    }

    private static void selecSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

    }
}
