package com.zhounian.algorithm;

import java.util.Random;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr=new int[20];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(150);
            System.out.print(arr[i]+" ");
        }
        long start=System.currentTimeMillis();
        insertsort(arr);
        long end=System.currentTimeMillis();
        System.out.println();
        System.out.println(end-start);

        System.out.println();
        for(int e:arr)
            System.out.print(e+" ");
        System.out.println();
    }

    private static void insertsort(int[] arr) {
        int startIndex=-1;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1])
            {
                startIndex=i+1;
                break;
            }
        }
        for (int i = startIndex; i < arr.length; i++) {
//            int j=i;
//            while(j>0&&arr[j]<arr[j-1])
//            {
//                int temp=arr[j];
//                arr[j]=arr[j-1];
//                arr[j-1]=temp;
//                j--;
//            }
            int temp=arr[i];
            for (int j = i-1; j >=0; j--) {
                if(arr[j]>temp)
                {
                    arr[j+1]=arr[j];
                    if(j==0)
                        arr[j]=temp;
                }
                else
                {
                    arr[j+1]=temp;
                    break;
                }
            }

            }
        }
    }

