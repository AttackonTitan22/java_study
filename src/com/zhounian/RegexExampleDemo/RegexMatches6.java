package com.zhounian.RegexExampleDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches6 {
    public static void main(String[] args) {
        checkQQ2("0123134");
    }
    public static void checkQQ2(String qq) {
        String reg = "[1-9][0-9]{4,14}";
        System.out.println(qq.matches(reg)?"合法qq":"非法qq");
    }


}
