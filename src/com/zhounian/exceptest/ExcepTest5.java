package com.zhounian.exceptest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//try-with-resources 语句关闭所有实现 AutoCloseable 接口的资源。
//在 try-with-resources 语句中声明和实例化 BufferedReader 对象，
// 执行完毕后实例资源，不需要考虑 try 语句是正常执行还是抛出异常。
//如果发生异常，可以使用 catch 来处理异常。
public class ExcepTest5 {
    public static void main(String[] args) {
        String line;
        try(BufferedReader br = new BufferedReader(new FileReader("NOtest.txt"))) {
            while ((line = br.readLine()) != null) {
                System.out.println("Line =>"+line);
            }
        } catch (IOException e) {
            System.out.println("IOException in try block =>" + e.getMessage());
            e.printStackTrace();
        }
        //br资源自动关闭，无需br.close()
    }
}
