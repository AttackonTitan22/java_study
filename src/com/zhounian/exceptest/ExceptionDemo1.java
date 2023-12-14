package com.zhounian.exceptest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {

    public static void main(String[] args) throws ParseException {

        //编译时异常（在编译阶段，必须手动处理，否则代码报错）
        String time="2023年12月11日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(time);
        System.out.println(date);

        //运行时异常（在编译阶段是不需要处理的，是代码运行时出现的异常）
        int[] arr={1,2,3,4,5};
        System.out.println(arr[5]);//ArrayIndexOutOfBoundsException
    }
}
