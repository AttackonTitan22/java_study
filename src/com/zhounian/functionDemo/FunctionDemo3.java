package com.zhounian.functionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

//引用其他类的成员方法  和本类成员方法引用（引用处不能是静态方法）
/*对象::成员方法

this::成员方法

super::成员方法*/
public class FunctionDemo3 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰");

        //这是匿名内部类书写
        System.out.println("这是匿名内部类书写");
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("张")&&s.length()==3;
            }
        }).forEach(System.out::println);

        //方法引用其他类的成员方法
        System.out.println("方法引用其他类的成员方法");
        list.stream().filter(new StringOperation()::stringJudge).forEach(System.out::println);
        StringOperation stringOperation = new StringOperation();
        list.stream().filter(stringOperation::stringJudge).forEach(System.out::println);

        //方法引用本类成员方法
        System.out.println("方法引用本类成员方法");
        list.stream().filter(new FunctionDemo3()::stringJudge).forEach(System.out::println);


    }
    public boolean stringJudge(String s){
        return s.startsWith("张")&&s.length()==3;
    }

}

class StringOperation{

    public boolean stringJudge(String s){
        return s.startsWith("张")&&s.length()==3;
    }
}
