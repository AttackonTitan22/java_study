package com.zhounian.streamfileIO;

import java.io.*;

public class BufferWithFileInput {
    public static void main(String[] args) {
        copy_zip_to_another_zip_buffer_stream();
        copy_zip_to_another_zip_stream();

    }
    static void copy_zip_to_another_zip_buffer_stream() {
        // 记录开始时间
        long start = System.currentTimeMillis();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("demomusic-java.zip"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("demomusic-java-copy.zip"))) {
            int content;
            while ((content = bis.read()) != -1) {
                bos.write(content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("使用缓冲流复制zip文件总耗时:" + (end - start) + " 毫秒");
    }

    static void copy_zip_to_another_zip_stream() {
        // 记录开始时间
        long start = System.currentTimeMillis();
        try (FileInputStream fis = new FileInputStream("demomusic-java.zip");
             FileOutputStream fos = new FileOutputStream("demomusic-java-copy2.zip")) {
            int content;
            while ((content = fis.read()) != -1) {
                fos.write(content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("使用普通流复制zip文件总耗时:" + (end - start) + " 毫秒");
    }

}
