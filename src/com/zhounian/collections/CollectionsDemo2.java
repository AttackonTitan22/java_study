package com.zhounian.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CollectionsDemo2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"sdf","ji","hs","bw","tn","igh","sgi","greiv","pgr");
        int size = list.size();

        ArrayList<String> list2 = new ArrayList<>();
        int n=1;
        while (n<=10){
            System.out.println("======================第"+n+"轮点名=============");
            while (!list.isEmpty())
            {
                Random random = new Random();
                int i = random.nextInt(list.size());
                String name = list.remove(i);
                System.out.println(name);
                list2.add(name);
            }
            System.out.println();
            list2.forEach( name-> list.add(name));
            list2.clear();
            n++;
        }

    }
}
