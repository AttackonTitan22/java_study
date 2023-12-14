package com.zhounian.ui;

import java.util.Random;

public class CodeUtil {
    private static String code;

    public static String getCode() {
        StringBuilder sb = new StringBuilder("");
        char[] array=new char[4];
        for (int i = 0; i < 4; i++) {
            Random r = new Random();
            if(r.nextInt(2)==1)
            {
                array[i]=(char)(r.nextInt(26) + 65);
            }
            else {
                array[i]=(char)(r.nextInt(26) + 97);
            }
        }
        sb.append(array);
        Random r = new Random();
        sb.insert(r.nextInt(5),r.nextInt(10));
        code=sb.toString();
        return code;
    }

}
