package com.zhounian.socketDemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class Server_my extends Thread{
    private ServerSocket serverSocket;

    public Server_my(int port) throws IOException
    {
        //创建绑定到特定端口的服务器套接字。
        serverSocket = new ServerSocket(port);
        //通过指定超时值启用/禁用 SO_TIMEOUT，以毫秒为单位。
        //serverSocket.setSoTimeout(10000);
    }
    public void run()
    {
            try
            {
                System.out.println("等待Client_my远程连接，端口号为：" + serverSocket.getLocalPort() + "...");

                //服务器调用 ServerSocket 类的 accept() 方法，该方法将一直等待，直到客户端连接到服务器上给定的端口。
                Socket server = serverSocket.accept();
                System.out.println("远程Client_my主机地址：" + server.getRemoteSocketAddress());
                DataInputStream in = new DataInputStream(server.getInputStream());
                System.out.println(in.readUTF());
                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                out.writeUTF("谢谢连接我：" + server.getLocalSocketAddress() + "\nGoodbye!");
                server.close();
            }catch(SocketTimeoutException s)
            {
                System.out.println("Socket timed out!");
            }catch(IOException e)
            {
                e.printStackTrace();
            }


    }
    public static void main(String [] args)
    {
        int port = Integer.parseInt(args[0]);
        try
        {
            Thread t = new Server_my(port);
            t.run();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
