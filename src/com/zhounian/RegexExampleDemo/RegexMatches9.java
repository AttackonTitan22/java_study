package com.zhounian.RegexExampleDemo;

public class RegexMatches9 {
    public static void main(String[] args) {
        //需求1：判断一个字符串的开始字符和结束字符是否一致？只考虑一个字符
        //   \\组号：  表示把第X组的内容再出来用一次
        String regex1="(.).+\\1";
        System.out.println("a123a".matches(regex1));
        System.out.println("b456b".matches(regex1));
        System.out.println("17891".matches(regex1));
        System.out.println("&abc&".matches(regex1));
        System.out.println("a123b".matches(regex1));

        //需求2：判断一个字符串的开始部分和结束部分是否一致？可以有多个字符
        String regex2="(.+).+\\1";
        System.out.println("abc123abc".matches(regex2));
        System.out.println("b456b".matches(regex2));
        System.out.println("123789123".matches(regex2));
        System.out.println("&!@abc&!@".matches(regex2));
        System.out.println("abc123abd".matches(regex2));

        //需求3：判断一个字符串的开始部分和结束部分是否一致？而且开始部分的内部也要一致
        String regex3="((.)\\2*).+\\1";
        System.out.println("aaa123aaa".matches(regex3));
        System.out.println("bbbb456bbbb".matches(regex3));
        System.out.println("111789111".matches(regex3));
        System.out.println("&&abc&&".matches(regex3));
        System.out.println("aaa123aab".matches(regex3));

        /*
        需求:将字符串：我喜欢睡睡睡叫叫叫吃吃吃
        替换成：我喜欢睡叫吃
         */
        String str="我喜欢睡睡睡叫叫叫吃吃吃";

        //需求： 把重复的内容替换为单个的
        //$1 表示把正则表达式中第一组的内容，拿出来再用
        String result= str.replaceAll("(.)\\1+","$1");
        System.out.println(result);
    }
}
