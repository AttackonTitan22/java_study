package com.zhounian.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    //跟注册相关的代码，都写在这个界面中
    public RegisterJFrame(){
        this.setSize(488,500);

        //设置界面的标题
        this.setTitle("注册");

        //设置界面置顶
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //让显示来，建议写在最后
        this.setVisible(true);
    }
}
