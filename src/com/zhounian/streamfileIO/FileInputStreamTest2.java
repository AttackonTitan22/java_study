package com.zhounian.streamfileIO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("input.txt");
//必须将fileInputStream作为构造参数才能使用
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
//可以读取任意具体的类型数据
            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readUTF());
        }
        catch(IOException e)
        {
            //e.printStackTrace();
        }

    }
}
