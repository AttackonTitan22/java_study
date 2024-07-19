package com.zhounian.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ToArray {
    public static void main(String[] args) {
        String [] s= new String[]{
                "dog", "lazy", "a", "over", "jumps", "fox", "brown", "quick", "A"
        };
        List<String> list = Arrays.asList(s);
        Collections.reverse(list);
        //没有指定类型的话会报错
        //new String[0]作为Collection.toArray()方法的参数现在使用更好，
        // new String[0]就是起一个模板的作用，指定了返回数组的类型，
        // 0 是为了节省空间，因为它只是为了说明返回的类型。
        String[] strings = list.toArray(new String[0]);
        for (String string : strings) {
            System.out.print(string+" ");
        }


    }
}
