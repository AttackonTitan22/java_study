package com.zhounian.socketDemo;

import java.net.*;
import java.io.*;
//如下的 GreetingClient 是一个客户端程序，该程序通过 socket 连接到服务器并发送一个请求，然后等待一个响应。
public class GreetingClient {
    public static void main(String [] args)
    {
        String serverName = args[0];
        int port = Integer.parseInt(args[1]);
      try
    {
        System.out.println("连接到主机：" + serverName + " ，端口号：" + port);

        //创建一个流套接字并将其连接到指定主机上的指定端口号
        Socket client = new Socket(serverName, port);
        //client.getRemoteSocketAddress()返回此套接字连接的端点的地址，如果未连接则返回 null。
        System.out.println("远程主机地址：" + client.getRemoteSocketAddress());

        //返回此套接字的输出流来实例化对象
        OutputStream outToServer = client.getOutputStream();
        DataOutputStream out = new DataOutputStream(outToServer);

        out.writeUTF("Hello from " + client.getLocalSocketAddress());

        InputStream inFromServer = client.getInputStream();
        DataInputStream in = new DataInputStream(inFromServer);
        System.out.println("服务器响应： " + in.readUTF());
        client.close();
    }catch(IOException e)
    {
        e.printStackTrace();
    }
}
}
