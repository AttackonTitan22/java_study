package com.zhounian.map;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeMap;


//将treemap中的元素按照升序或降序排列
public class TreeMapDemo1 {
    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //o1当前要添加的元素，o2在红黑树中的元素
                return o2-o1;
            }
        });
        Random random = new Random();
        treeMap.put(random.nextInt(80),"sdf");
        treeMap.put(random.nextInt(80),"sdfsfdsg");
        treeMap.put(random.nextInt(80),"sdfsdb");
        treeMap.put(random.nextInt(80),"sdasf");



        System.out.println(treeMap);
    }
}
