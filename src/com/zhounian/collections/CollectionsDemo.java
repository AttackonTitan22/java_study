package com.zhounian.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo {
    public static void main(String[] args) {

        //public static <T> boolean addAll(Collection<T> c， T... elements) 打乱List集合元素的顺序
        //public static void shuffle(List<?> list)                    批量添加元素
        //public static <T> void sort(List<T> list)                         排序
        // public static <T> void sort(List<T> list, Comparator<T> c)      根据指定的规则进行排序
        // public static <T> int binarySearch (List<T> list, T key)        以二分查找法查找元素
        // public static <T> void copy(List<T> dest, List<T> src)          拷贝集合中的元素
        // public static <T> int fill (List<T> list, T obj)                使用指定的元素填充集合
        // public static <T> void max/min(Collection<T> coll)              根据默认的自然排序获取最大/小值
        // public static <T> void swap(List<?> list, int i, int j)         交换集合中指定位置的元素


        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"abc","asdf","qwer","1234","linlin","wsm","op");

        System.out.println(list);

        Collections.shuffle(list);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        });

        System.out.println(list);

        System.out.println(Collections.binarySearch(list, "1234"));

        ArrayList<String> src = new ArrayList<>();

        src.add("51");
        src.add("sdf");
        src.add("162");
        src.add("82661");
        src.add("8715");
        src.add("239");
        src.add("59595");

        Collections.copy(list,src);

        System.out.println(list);

        Collections.fill(src,"abc");

        System.out.println(src);

        System.out.println(Collections.max(list));

        System.out.println(Collections.min(list));

        Collections.swap(list,0,1);

        System.out.println(list);


    }
}
