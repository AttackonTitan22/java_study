package com.zhounian.lambdaDemo;

public class LambdaDemo3 {
    public static void main(String[] args) {
        /*
        函数式接口：
        有且仅有一个抽象方法的接口叫做函数式接口，接口上方可以加@FunctionalInterface注解
         */
        method(new Swim() {
            @Override
            public void swimming() {
                System.out.println("正在游泳----");
            }
        });

        method(()->{
            System.out.println("正在用Lambda游泳");
        });

    }
    public static void method(Swim s){
        s.swimming();
    }
}

//必须是函数式接口才可以
@FunctionalInterface
interface Swim{
    public abstract void swimming();

}
