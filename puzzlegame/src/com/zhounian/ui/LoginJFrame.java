package com.zhounian.ui;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

public class LoginJFrame extends JFrame implements MouseListener {
    //LoginJFrame表示登录界面
    //以后所有跟登录相关的代码，都写在这里

    //创建一个集合存储正确的用户名和密码
    static ArrayList<User> list =new ArrayList<User>();
    static {
        list.add((new User("zhangsan","123")));
        list.add((new User("lisi","1234")));
    }


    //2.添加用户名输入框
    JTextField username = new JTextField();

    //4.密码输入框
    JTextField password = new JTextField();

    //验证码的输入框
    JTextField code = new JTextField();
    //验证码的显示
    String codeStr = CodeUtil.getCode();
    JLabel rightCode = new JLabel();

    //5.添加登录按钮
    JButton login = new JButton();
    //6.添加注册按钮
    JButton register = new JButton();

    public LoginJFrame(){


        initJFrame();

        initView();
        //让显示来，建议写在最后
        this.setVisible(true);


    }

    private void initView() {
        //1. 添加用户名文字
        JLabel usernameText = new JLabel(new ImageIcon("puzzlegame\\image\\login\\用户名.png"));
        usernameText.setBounds(116, 135, 47, 17);
        this.getContentPane().add(usernameText);


        username.setBounds(195, 134, 200, 30);
        this.getContentPane().add(username);

        //3.添加密码文字
        JLabel passwordText = new JLabel(new ImageIcon("puzzlegame\\image\\login\\密码.png"));
        passwordText.setBounds(130, 195, 32, 16);
        this.getContentPane().add(passwordText);


        password.setBounds(195, 195, 200, 30);
        this.getContentPane().add(password);

        //验证码提示
        JLabel codeText = new JLabel(new ImageIcon("puzzlegame\\image\\login\\验证码.png"));
        codeText.setBounds(133, 256, 50, 30);
        this.getContentPane().add(codeText);


        code.setBounds(195, 256, 100, 30);
        this.getContentPane().add(code);


        //设置内容
        rightCode.setText(codeStr);
        //位置和宽高
        rightCode.setBounds(300, 256, 50, 30);
        //添加到界面
        this.getContentPane().add(rightCode);
        //绑定鼠标事件
        rightCode.addMouseListener(this);


        //设置登录按钮
        login.setBounds(123, 310, 128, 47);
        login.setIcon(new ImageIcon("puzzlegame\\image\\login\\登录按钮.png"));
        //去除按钮的默认边框
        login.setBorderPainted(false);
        //去除按钮的默认背景
        login.setContentAreaFilled(false);
        this.getContentPane().add(login);

        //给登录按钮设置事件监听
        login.addMouseListener(this);

        //设置注册按钮
        register.setBounds(256, 310, 128, 47);
        register.setIcon(new ImageIcon("puzzlegame\\image\\login\\注册按钮.png"));
        //去除按钮的默认边框
        register.setBorderPainted(false);
        //去除按钮的默认背景
        register.setContentAreaFilled(false);
        this.getContentPane().add(register);

        //给注册按钮设置事件监听
        register.addMouseListener(this);

        //7.添加背景图片
        JLabel background = new JLabel(new ImageIcon("puzzlegame\\image\\login\\background.png"));
        background.setBounds(0, 0, 470, 390);
        this.getContentPane().add(background);

    }

    private void initJFrame() {
        //在创建登陆界面的时候，同时给这个界面去设置一些信息
        //宽高，直接展示出来
        this.setSize(488,430);

        //设置界面的标题
        this.setTitle("登录");

        //居中
        this.setLocationRelativeTo(null);

        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setAlwaysOnTop(true);//置顶

        //取消默认的居中放置
        this.setLayout(null);
    }

    //要展示用户名或密码错误
    public void showJDialog(String content) {
        //创建一个弹框对象
        JDialog jDialog = new JDialog();
        //给弹框设置大小
        jDialog.setSize(200, 150);
        //让弹框置顶
        jDialog.setAlwaysOnTop(true);
        //让弹框居中
        jDialog.setLocationRelativeTo(null);
        //弹框不关闭永远无法操作下面的界面
        jDialog.setModal(true);

        //创建Jlabel对象管理文字并添加到弹框当中
        JLabel warning = new JLabel(content);
        warning.setBounds(0, 0, 200, 150);
        jDialog.getContentPane().add(warning);

        //让弹框展示出来
        jDialog.setVisible(true);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        Object source = e.getSource();
        User newUser = new User(username.getText(), password.getText());
        if(source==login)
        {
            System.out.println("按下了登录");
            if(password.getText().length()==0&&username.getText().length()==0)
            {
                System.out.println("用户名和密码为空");
                showJDialog("用户名和密码为空");
            }
            else if(contains(newUser)&&code.getText().equals(codeStr))
            {
                this.setVisible(false);
                new GameJFrame();
            }
            else if(!code.getText().equals(codeStr))
            {
                System.out.println(code.getText());

                showJDialog("验证码输入错误");
            }

        }
        else if(source==register)
        {
            System.out.println("按下了注册");
        }else if (e.getSource() == rightCode) {
            System.out.println("更换验证码");
            //获取一个新的验证码
            String code = CodeUtil.getCode();
            rightCode.setText(code);
        }

    }

    private boolean contains(User newUser) {
        Iterator<User> iterator = list.iterator();
        while(iterator.hasNext())
        {
            User temp= iterator.next();
            if(temp.name.equals(newUser.name)&&temp.code.equals(newUser.code))
                return true;
        }
        return false;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Object source = e.getSource();
        if(source==login)
        {
            login.setIcon(new ImageIcon("puzzlegame/image/login/登录按下.png"));

        }
        else if(source==register)
        {
            register.setIcon(new ImageIcon("puzzlegame/image/login/注册按下.png"));
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Object source = e.getSource();
        if(source==login)
        {
            login.setIcon(new ImageIcon("puzzlegame/image/login/登录按钮.png"));

        }
        else if(source==register)
        {
            register.setIcon(new ImageIcon("puzzlegame/image/login/注册按钮.png"));
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
