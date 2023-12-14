package com.zhounian.functionDemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class FunctionDemo1 {
    public static void main(String[] args) {

        Integer [] arr={5,9,2,4,7,3};

        //lambda表达式
/*        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });*/

        //Arrays.sort(arr, ( o1,  o2)->o1-o2);


        //方法引用
        //- 需要有函数式接口
        //- 被引用方法必须已经存在
        //- 被引用方法的形参和返回值需要跟抽象方法保持一致
        //- 被引用方法的功能要满足当前的需求
        Arrays.sort(arr,FunctionDemo1::subtraction);

        System.out.println(Arrays.toString(arr));
    }

    //int 被自动装箱成Integer
    public static int subtraction(int o1,int o2){
        return o2-o1;
    }
}
