package com.zhounian.exceptest;

import java.util.zip.CheckedInputStream;

public class ExcepTest2 {
    public static void main(String[] args) {
        checkNumber(-1);
    }
    public static void checkNumber(int num) {
         if (num < 0) {
                throw new IllegalArgumentException("Number must be positive");
         }
            }

}
