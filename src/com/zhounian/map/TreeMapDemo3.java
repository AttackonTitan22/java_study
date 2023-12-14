package com.zhounian.map;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo3 {
    public static void main(String[] args) {

        //统计字符串“aababcabcdabcde”每个字母出现的个数
        //a(5)b(4)c(3)d(2)e(1)
        //将结果进行排序用TreeMap
        //没有指定，用HashMap

        String str="aababcabcdabcde";

        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(treeMap.containsKey(c)){
                Integer count = treeMap.get(c);
                count++;
                treeMap.put(c,count);
            }
            else{
                treeMap.put(c,1);
            }

        }
        treeMap.forEach((Character key,Integer value)->
        {
            System.out.print(key+"("+value+")");
        });

        System.out.println();
        StringBuilder sb = new StringBuilder();
        treeMap.forEach((key,value)->
        {
            sb.append(key).append("(").append(value).append(")");
        });
        System.out.println(sb);

    }
}
