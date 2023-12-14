package com.zhounian.argsDemo;




//可变参数
public class ArgsDemo1 {
    public static void main(String[] args) {

        //格式：属性类型...名字
        //int...args

        int sum=getSum(1,2,3,4,5,6,7,8,9);
        System.out.println(sum);

    }

    //底层：可变参数底层就是一个数组
    //不需要自己创建，java自己创建
    //有其他参数，可变参数需要写最后边
    private static int getSum(int a,int ...args){
        System.out.println(args);

        int sum=0;
        for (int i:args){
            sum+=i;
        }
        return sum;
    }
}
