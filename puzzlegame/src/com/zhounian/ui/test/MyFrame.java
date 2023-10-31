package com.zhounian.ui.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyFrame extends JFrame implements ActionListener{
    //创建一个按钮对象
    JButton jtb1=new JButton("点我jtb1");
    //创建一个按钮对象
    JButton jtb2=new JButton("点我jtb2");
    public MyFrame() {
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

        //设置位置和宽高
        Random r =new Random();
        jtb2.setBounds(r.nextInt(500),r.nextInt(500),100,50);
        //给按钮添加动作监听
        //jtb：组件对象，表示你要给哪个组件添加事件
        //addActionListener:表示我要给组件添加哪个事件监听
        //参数：表示事件被触发后要执行的代码
        //jbt.addActionListener(new MyActionListener());

        jtb1.addActionListener(this);

        jtb2.addActionListener(this);

        this.getContentPane().add(jtb1);
        this.getContentPane().add(jtb2);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();
        if(source ==jtb1)
        System.out.println("不要点jtb1");
        else
        {
            Random r = new Random();
            jtb2.setBounds(r.nextInt(500),r.nextInt(500),100,50);
            System.out.println("不要点jtb2");
        }

    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
    }
}
