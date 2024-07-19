package com.zhounian.socketnet.Demo1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress address = InetAddress.getByName("192.168.31.196");
        System.out.println(address);

        String ip = address.getHostAddress();
        System.out.println(ip);

        String name = address.getHostName();
        System.out.println(name);
    }
}
