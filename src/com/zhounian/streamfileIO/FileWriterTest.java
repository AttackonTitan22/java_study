package com.zhounian.streamfileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterTest {
    public static void main(String[] args) {
        try (Writer output = new FileWriter("output.txt")) {
            output.write("你好，我是周年，java学习时间5天。");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
