package com.zhounian.exercise;

import java.util.Random;

public class Test1 {
    //生成验证码
    public static void main(String[] args) {

        char[] chs=new char[60];
        String result="";
        for(int i=0;i<chs.length;i++)
        {
            chs[i]=(char)(97+i);

            if(i>25&&i<=51)
            {
                chs[i]=(char)(65+i-26);
            }
            else if(i>51)
                chs[i]=(char)(48+i-52);

        }
        Random r=new Random();
        for(int i=0;i<5;i++)
        {
            int index=r.nextInt(60);
            result+=chs[index];
        }

        System.out.println(result);


    }
}
