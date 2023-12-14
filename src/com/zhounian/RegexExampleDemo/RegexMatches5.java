package com.zhounian.RegexExampleDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// appendTail 方法：sb 是一个 StringBuffer，这个方法是把最后一次匹配到内容之后的字符串追加到 StringBuffer 中。
public class RegexMatches5 {
    private static String REGEX = "a*b";//代表匹配0到N个a然后加上b
    private static String INPUT = "aabfooaabfooabfoobkkk";
    private static String REPLACE = "-";
    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        // 获取 matcher 对象
        Matcher m = p.matcher(INPUT);
        Matcher m2 = p.matcher(INPUT);
        StringBuffer sb = new StringBuffer();
        if(m.find()){
            m.appendReplacement(sb,REPLACE);

        }
        m.appendTail(sb);
        System.out.println(sb.toString());
        StringBuffer sb2 = new StringBuffer();


        while (m2.find()){
            m2.appendReplacement(sb2,REPLACE);
            System.out.println(sb2);
        }
        m2.appendTail(sb2);
        System.out.println(sb2.toString());
    }
}
