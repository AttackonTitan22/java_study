package com.zhounian.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BasicSearch {
    public static void main(String[] args) {
        Random r=new Random();
        int[] arr=new int [10];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(100);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int key=r.nextInt(100);
        System.out.println(key);

        System.out.println(basicsearch(arr, key));

        ArrayList<Integer> list;
        list=Basicsearch(arr,key);
        for(int e:list)
            System.out.print(e+" ");

    }

    private static boolean basicsearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]== key)
                return true;
        }
        return false;
    }

    private static ArrayList<Integer> Basicsearch(int[] arr, int key) {
        ArrayList<Integer>list =new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]== key)
                list.add(i);
        }
        return list;
    }
}
