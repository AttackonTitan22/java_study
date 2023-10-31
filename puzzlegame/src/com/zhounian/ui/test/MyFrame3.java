package com.zhounian.ui.test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.util.Random;

public class MyFrame3 extends JFrame implements KeyListener {
    //创建一个按钮对象
    JButton jtb1=new JButton("点我jtb1");

    public MyFrame3() {
        this.setSize(603,680);

        //设置界面的标题
        this.setTitle("拼图游戏单机版 v1.0");

        //设置界面置顶
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //取消默认的居中放置
        this.setLayout(null);


        //设置位置和宽高
        jtb1.setBounds(0,0,100,50);

        //给按钮添加动作监听
        //jtb：组件对象，表示你要给哪个组件添加事件
        //addActionListener:表示我要给组件添加哪个事件监听
        //参数：表示事件被触发后要执行的代码
        //jbt.addActionListener(new MyActionListener());

        jtb1.addKeyListener(this);

        this.getContentPane().add(jtb1);


        this.setVisible(true);
    }


    public static void main(String[] args) {
        MyFrame3 myFrame3 = new MyFrame3();
    }



    //细节1：
    //如果按下一个按键没有松开，那么会重复的去调用keyPressed方法
    //细节2：
    //键盘按键如何区分？
    //每一个按键都有与之相对应的编号
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按下不松");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开按键");
        //获取键盘上每一个按键的编号
        int code =e.getKeyCode();
        if(code==65)
            System.out.println("A");
        else if (code==66)
            System.out.println("B");
    }
}
