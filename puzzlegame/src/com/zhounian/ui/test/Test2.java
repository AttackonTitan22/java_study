package com.zhounian.ui.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        JFrame jframe=new JFrame();
        jframe.setSize(603,680);

        //设置界面的标题
        jframe.setTitle("拼图游戏单机版 v1.0");

        //设置界面置顶
        jframe.setLocationRelativeTo(null);
        //设置关闭模式
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //取消默认的居中放置
        jframe.setLayout(null);

        //创建一个按钮对象
        JButton jtb1=new JButton("点我");
        //设置位置和宽高
        jtb1.setBounds(0,0,100,50);

        //创建一个按钮对象
        JButton jtb2=new JButton("点我");
        //设置位置和宽高
        Random r =new Random();
        jtb2.setBounds(r.nextInt(500),r.nextInt(500),100,50);
        //给按钮添加动作监听
        //jtb：组件对象，表示你要给哪个组件添加事件
        //addActionListener:表示我要给组件添加哪个事件监听
        //参数：表示事件被触发后要执行的代码
        //jbt.addActionListener(new MyActionListener());

        jtb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("不要点我");
            }
        });

        jtb2.addActionListener(new MyListener());

        jframe.getContentPane().add(jtb1);
        jframe.getContentPane().add(jtb2);

        jframe.setVisible(true);
    }
}
