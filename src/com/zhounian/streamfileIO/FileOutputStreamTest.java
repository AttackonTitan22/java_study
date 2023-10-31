package com.zhounian.streamfileIO;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        try (FileOutputStream output = new FileOutputStream("output.txt")) {
            byte[] array = "JavaGuide".getBytes();
            for(byte ele:array)
                System.out.print((char)ele+" ");
            output.write(array);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
