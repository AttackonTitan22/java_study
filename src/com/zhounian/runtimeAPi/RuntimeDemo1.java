package com.zhounian.runtimeAPi;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {
        Runtime.getRuntime().exec("shutdown -a");
    }
}
