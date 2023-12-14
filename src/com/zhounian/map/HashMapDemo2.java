package com.zhounian.map;

import java.util.*;

//统计80个学生去A B C D 四个景点，统计去的人最多的景点到底有多少人
//用hashmap
public class HashMapDemo2 {
    public static void main(String[] args) {

        String[] arr={"A","B","C","D"};

        Random r = new Random();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }


        HashMap<String, Integer> hashMap = new HashMap<>();
        list.forEach((String name)->{
            if(hashMap.containsKey(name)){
                Integer count = hashMap.get(name);
                count++;
                hashMap.put(name,count);
            }else{
                hashMap.put(name,1);
            }
        });

        hashMap.forEach((String name,Integer num)-> System.out.println(name+"="+num));

        int max=0;
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        for(Map.Entry<String, Integer> entry:entries){
            if(entry.getValue()>max)
                max=entry.getValue();
        }

        for(Map.Entry<String, Integer> entry:entries){
            if(entry.getValue()==max)
                System.out.println(entry.getKey()+":"+ entry.getValue());
        }
    }
}
