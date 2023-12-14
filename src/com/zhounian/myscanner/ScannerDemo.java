package com.zhounian.myscanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 从键盘接收数据

        // next方式接收字符串
/*        System.out.println("next方式接收：");
        // 判断是否还有输入
        if (scanner.hasNext()) {
            String str1 = scanner.next();
            System.out.println("输入的数据为：" + str1);
        }*/

        // nextLine方式接收字符串
        System.out.println("nextLine方式接收：");
        // 判断是否还有输入
        if (scanner.hasNextLine()) {
            String str1 = scanner.nextLine();
            System.out.println("输入的数据为：" + str1);
        }
        scanner.close();
    }
}

