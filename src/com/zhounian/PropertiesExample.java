package com.zhounian;

import java.io.*;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) {
        Properties prop = new Properties();

        try {
            // 读取属性文件
            prop.load(new FileInputStream("config.properties"));

            // 获取属性值
            String username = prop.getProperty("username");
            String password = prop.getProperty("password");

            // 输出属性值
            System.out.println("username: " + username);
            System.out.println("password: " + password);

            // 修改属性值
            prop.setProperty("username", "newUsername");
            prop.setProperty("password", "newPassword");

            // 保存属性到文件
            prop.store(new FileOutputStream("config.properties"), null);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}