package com.zhounian.algorithm;

import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr=new int[1000000];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt();
            //System.out.print(arr[i]+" ");
        }
        long start=System.currentTimeMillis();
        quickSort(arr,0,arr.length-1);
        long end=System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println();
//        for(int e:arr)
//            System.out.print(e+" ");
    }

    private static void quickSort(int[] arr,int i,int j) {
        int start=i;
        int end=j;
        //递归调用的出口
        if(start>end)
            return;
        while(end!=start)
        {
            while(arr[end]>=arr[i]&&end>start)
                end--;
            while (arr[start]<=arr[i]&&start<end)
                start++;

            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
        int temp=arr[start];
        arr[start]=arr[i];
        arr[i]=temp;

        //递归调用自身
        quickSort(arr,i,start-1);
        quickSort(arr,start+1,j);
    }

}

