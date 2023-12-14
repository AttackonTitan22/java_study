package com.zhounian.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;


//采用lambda方式进行遍历
public class MapDemo3 {
    public static void main(String[] args) {


        Map<String, String> map = new HashMap<>();


        map.put("尹志平", "小龙女");
        map.put("郭靖", "穆念慈");
        map.put("欧阳克", "黄蓉");



        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key+":"+value);
            }
        });


        System.out.println();

        map.forEach((String key, String value)->System.out.println(key+":"+value));

        System.out.println();

        map.forEach(( key,  value)->System.out.println(key+":"+value));



    }

}
