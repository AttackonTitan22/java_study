package com.zhounian.streamfileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MusicCompound
{
    public static void main(String args[])
    {
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        String fileNames[] = {"D:\\java_study\\demomusic-java\\示例歌曲\\星月神话.mp3","D:\\java_study\\demomusic-java\\示例歌曲\\我只在乎你.mp3"};
        //设置byte数组，每次往输出流中传入8K的内容
        byte by[] = new byte[1024*8];
        try
        {
            fileOutputStream = new FileOutputStream("D:\\java_study\\demomusic-java\\示例歌曲\\合并.mp3");
            int[] arr= {0, 1, 0, 1};
            for(int i=0;i<arr.length;i++)
            {
                int count = 0;
                fileInputStream = new FileInputStream(fileNames[arr[i]]);
                //跳过前面(i+1)M的歌曲内容
                fileInputStream.skip(1024*1024/2*(i+1));
                while(fileInputStream.read(by) != -1)
                {
                    fileOutputStream.write(by);
                    count++;
                    System.out.println(count);
                    //要截取中间2MB的内容，每次输入8k的内容，所以输入的次数是1024*2/8
                    if(count == (1024*1/8)&&i%2==0)
                    {
                        break;
                    }
                    if(count == (1024*0.5/8)&&i%2!=0)
                    {
                        break;
                    }
                }
            }
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                //输出完成后关闭输入输出流
                fileInputStream.close();
                fileOutputStream.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}