package com.zhounian.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringJoiner;

//键：province
//值：城市
//输出格式：
//江苏省=南京市,扬州市,苏州市,无锡市,常州市
//湖北省=武汉市,孝感市,十堰市,宜昌市,鄂州市
//四川省=成都市,乐山市,宜宾市,西昌市,泸州市


public class CollectionsDemo3 {
    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> list = new HashMap<>();

        list.put("湖北省",new ArrayList<>());
        list.put("四川省",new ArrayList<>());
        list.put("江苏省",new ArrayList<>());

        ArrayList<String> l1 = list.get("湖北省");
        Collections.addAll(l1,"武汉市","孝感市","十堰市","宜昌市","鄂州市");

        ArrayList<String> l2 = list.get("四川省");
        Collections.addAll(l2,"成都市","乐山市","宜宾市","西昌市","泸州市");

        ArrayList<String> l3 = list.get("江苏省");
        Collections.addAll(l3,"南京市","扬州市","苏州市","无锡市","常州市");

        list.forEach((String province,ArrayList<String> citys)->{
            StringJoiner sj = new StringJoiner(",");
            citys.forEach(city->sj.add(city));
            System.out.println(province+"="+sj);
        });
    }
}
