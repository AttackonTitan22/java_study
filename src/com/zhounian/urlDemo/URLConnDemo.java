package com.zhounian.urlDemo;

import javax.net.ssl.HttpsURLConnection;
import java.net.*;
import java.io.*;

public class URLConnDemo {
    public static void main(String [] args)
    {
        try
        {
            URL url = new URL("https://www.runoob.com/java/java-url-processing.html");
            URLConnection urlConnection = url.openConnection();
            HttpsURLConnection connection = null;
            if(urlConnection instanceof HttpURLConnection)
            {
                connection = (HttpsURLConnection) urlConnection;
            }
            else
            {
                System.out.println("请输入 URL 地址");
                return;
            }
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
            String urlString = "";
            String current;
            while((current = in.readLine()) != null)
            {
                urlString += current;
            }
            System.out.println(urlString);
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
