package com.zhounian.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AsList {
    public static void main(String[] args) {
        String[] myArray = {"Apple", "Banana", "Orange"};
        List<String> myList = Arrays.asList(myArray);

        for (String s : myList) {
            System.out.print(s+" ");
        }


        //Arrays.asList()是泛型方法，传递的数组必须是对象数组，而不是基本类型。
        int[] myArray2 = {1, 2, 3};
        List myList2 = Arrays.asList(myArray2);
        System.out.println(myList2.size());//1
        System.out.println(myList2.get(0));//数组地址值
        int[] array = (int[]) myList2.get(0);
        System.out.println(array[0]);//1
        System.out.println(array[1]);

        Integer[] myArray3 = {1, 2, 3};
        List myList3 = Arrays.asList(myArray3);
        System.out.println(myList3.size());//1
        System.out.println(myList3.get(0));//数组地址值
        System.out.println(myList3.get(1));//数组地址值

        List<Integer> list = arrayToList(myArray3);
        list.add(4);
        for (Integer i : list) {
            System.out.print(i+" ");
        }



    }

    //那我们如何正确的将数组转换为 ArrayList ?
    static <T> List<T> arrayToList(final T[] array) {
        final List<T> l = new ArrayList<T>(array.length);

        l.addAll(Arrays.asList(array));
        return l;
    }
}
