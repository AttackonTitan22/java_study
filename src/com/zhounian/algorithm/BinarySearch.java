package com.zhounian.algorithm;

import java.util.Random;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr=new int[20];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            if(i==0)
                arr[i]=r.nextInt(10);
            else
                arr[i]=arr[i-1]+r.nextInt(20);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        while (true)
        {
            int key=r.nextInt(200);

            if(Binarysearch(arr,key)!=-1)
            {
                System.out.println(key);
                System.out.println(Binarysearch(arr,key));
                break;
            }

        }

    }

    public static int Binarysearch(int[] arr,int key)
    {
        int min=0;
        int max=arr.length-1;
        int mid=(max+min)/2;
        while (true)
        {
            if(min>max)
                return -1;
            if(arr[mid]>key)
            {
                max=mid-1;
            }
            else if(arr[mid]<key)
            {
                min=mid+1;
            }
            else
                return mid;
            mid=(min+max)/2;
        }
    }
}
