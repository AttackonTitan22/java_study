package com.zhounian.streamfileIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

// java 9以后的
public class BufferedInputStreamTest {
    public static void main(String[] args) {
        try {
            // 新建一个 BufferedInputStream 对象
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("input.txt"));
// 读取文件的内容并复制到 String 对象中
            String result = new String(bufferedInputStream.readAllBytes());
            System.out.println(result);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


    }
}
