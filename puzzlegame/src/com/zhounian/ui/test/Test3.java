package com.zhounian.ui.test;

import com.zhounian.ui.User;

import java.util.ArrayList;
import java.util.Iterator;

public class Test3 {
    static ArrayList<User> list =new ArrayList<User>();
    static {
        list.add((new User("zhangsan","123")));
        list.add((new User("lisi","1234")));
    }

    public static void main(String[] args) {
        Iterator<User> iterator = list.iterator();

    }

}
