package com.zhounian.RegexExampleDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches7 {
    public static void main(String[] args) throws IOException {
        /*
        把链接：https://m.sengzan.com/jiaoyu/29104.html?ivk_sa=1025883i
        中所有的身份证号码都爬取出来
         */

        //创建一个URL对象
        URL url=new URL("https://m.sengzan.com/jiaoyu/29104.html?ivk_sa=1025883i");
        //连接上这个网址
        //细节：保证网络是畅通
        URLConnection conn =url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String lines;
        //获取正则表达式的对象 pattern
        String regex ="[1-9]\\d{17}";
        Pattern pattern=Pattern.compile(regex);
        //在读取的时候每次都一整行
        while ((lines=br.readLine())!=null){
            //拿着文本匹配器的对象matcher按照pattern的规则去读取当前的这一行信息
            Matcher matcher =pattern.matcher(lines);
            while (matcher.find()){
                System.out.println(matcher.group());
            }
        }
        br.close();
    }
}
