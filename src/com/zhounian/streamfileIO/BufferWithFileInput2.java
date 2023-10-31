package com.zhounian.streamfileIO;

import java.io.*;

public class BufferWithFileInput2 {
    public static void main(String[] args) {
        copy_zip_to_another_zip_with_byte_array_buffer_stream();
        copy_zip_to_another_zip_with_byte_array_stream();
    }
   static void copy_zip_to_another_zip_with_byte_array_buffer_stream() {
        // 记录开始时间
        long start = System.currentTimeMillis();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("demomusic-java.zip"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("demomusic-java-copy.zip"))) {
            int len;
            byte[] bytes = new byte[1 * 1024];
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("使用缓冲流复制zip文件总耗时:" + (end - start) + " 毫秒");
    }

   static void copy_zip_to_another_zip_with_byte_array_stream() {
        // 记录开始时间
        long start = System.currentTimeMillis();
        try (FileInputStream fis = new FileInputStream("demomusic-java.zip");
             FileOutputStream fos = new FileOutputStream("demomusic-java-copy2.zip")) {
            int len;
            byte[] bytes = new byte[1 * 1024];
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("使用普通流复制zip文件总耗时:" + (end - start) + " 毫秒");
    }

}


