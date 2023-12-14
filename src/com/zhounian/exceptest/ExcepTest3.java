package com.zhounian.exceptest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExcepTest3 {
    public static void main(String[] args) {
        try {
            readFile("1.txt");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
    public static void readFile(String filePath) throws IOException {
     BufferedReader reader = new BufferedReader(new FileReader(filePath));
     String line = reader.readLine();
     while (line != null) {
         System.out.println(line);
         line = reader.readLine();
     }
     reader.close();
    }
}
