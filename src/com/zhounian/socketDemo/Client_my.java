package com.zhounian.socketDemo;


import java.net.*;
import java.io.*;
public class Client_my {
        public static void main(String [] args)
        {
            String serverName = args[0];
            int port = Integer.parseInt(args[1]);
            try
            {
                System.out.println("Client_my连接到主机：" + serverName + " ，端口号：" + port);

                //创建一个流套接字并将其连接到指定主机上的指定端口号
                Socket client = new Socket(serverName, port);
                //client.getRemoteSocketAddress()返回此套接字连接的端点的地址，如果未连接则返回 null。
                System.out.println("远程主机Server_my地址：" + client.getRemoteSocketAddress());

                //返回此套接字的输出流来实例化对象
                OutputStream outToServer = client.getOutputStream();
                DataOutputStream out = new DataOutputStream(outToServer);

                out.writeUTF("Hello from " + client.getLocalSocketAddress()+"Client_my");

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

