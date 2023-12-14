package com.zhounian.RegexExampleDemo;

public class RegexMatches8 {
    public static void main(String[] args) {
        String str="sodigjsdf这是第零sldignlds嘻嘻";

        String[] arr= str.split("[\\w&&[^_]]");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
