package com.zhounian.RegexExampleDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


//replaceFirst 和 replaceAll 方法用来替换匹配正则表达式的文本。
// 不同的是，replaceFirst 替换首次匹配，replaceAll 替换所有匹配。
public class RegexMatches4 {
    private static String REGEX = "dog";
    private static String INPUT = "The dog says meow. " +
            "All dogs say meow.";
    private static String REPLACE = "cat";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        // get a matcher object
        Matcher m = p.matcher(INPUT);
        INPUT = m.replaceAll(REPLACE);
        System.out.println(INPUT);
    }
}
