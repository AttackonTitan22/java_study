package com.zhounian.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {

    //JFrame 界面，窗体
    //子类呢也表示界面，窗体
    //规定：GameJFrame这个界面表示的就是游戏的主界面
    //以后跟游戏相关的所有逻辑都写在这个类中

    //创建一个二位数组
    //目的：用来管理数据
    //加载图片的时候，会根据二维数组的数据进行加载
    int[][] data=new int[4][4];

    //方块正确的顺序
    int[][] win=new int [][]{{1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}};

    //记录移动的步数
    int step=0;

    //记录0图片所在的二维数组坐标
    int x=0;
    int y=0;

    //创建选项下面的条目对象
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");


    JMenuItem girlItem = new JMenuItem("美女");
    JMenuItem animalItem = new JMenuItem("动物");
    JMenuItem sportItem = new JMenuItem("运动");



    JMenuItem accountItem = new JMenuItem("公众号");

    String path="puzzlegame\\image\\animal\\animal3\\";
    public GameJFrame(){
        //初始化界面
        initJFrame();
        //初始化菜单
        initJMenuBar();

        //初始化数据（打乱）
        initData();
        //初始化图片
        initImage();

        //让显示来，建议写在最后
        this.setVisible(true);
    }
    //初始化数据打乱
    private void initData() {
        int[] temp={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        Random r=new Random();

        for (int i = 0; i < temp.length; i++) {
            int index=r.nextInt(temp.length);

            int t=temp[i];
            temp[i]=temp[index];
            temp[index]=t;

        }
        for (int i = 0; i < temp.length; i++) {
            if(temp[i]==0)
            {
                x=i/4;
                y=i%4;
            }
            data[i/4][i%4]=temp[i];
        }

    }

    private void initImage() {
        //对界面全部清除
        this.getContentPane().removeAll();

        if(victory())
        {
            //显示胜利的图标
            JLabel winLabel=new JLabel(new ImageIcon("D:\\SoftwareLearning\\java_study\\puzzlegame\\image\\win.png"));
            winLabel.setBounds(203,283,197,73);
            this.getContentPane().add(winLabel);
        }

        JLabel stepCount=new JLabel("步数"+step);
        stepCount.setBounds(50,30,100,20);
        this.getContentPane().add(stepCount);
        for (int j = 0; j < 4; j++) {
            for (int i=0;i<4;i++)
            {
                //创建一个JLabel的对象（管理容器）
                JLabel jLabel= new JLabel(new ImageIcon(path+data[j][i]+".jpg"));
                //指定图片的位置
                jLabel.setBounds(i*105+83,j*105+134,105,105);

                //给图片添加边框
                //0表示让图片凸出来
                //1表示让图片凹下去
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                //把管理容器添加到界面中
                this.getContentPane().add(jLabel);

            }
        }
        //添加背景图片
        JLabel background =new JLabel(new ImageIcon("puzzlegame/image/background.png"));
        background.setBounds(40,40,508,560);
        //把图形添加到界面当中
        this.getContentPane().add(background);
        //对界面进行刷新
        this.getContentPane().repaint();

    }

    private void initJMenuBar() {
        //创建整个的菜单对象
        JMenuBar jMenubar=new JMenuBar();

        //创建菜单上面的两个选项的对象，（功能，关于我们）
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu =new JMenu("关于我们");
        JMenu changeItem = new JMenu("更换图片");


        //为每一个条目设置事件监听
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        changeItem.addActionListener(this);

        accountItem.addActionListener(this);

        girlItem.addActionListener(this);
        animalItem.addActionListener(this);
        sportItem.addActionListener(this);

        changeItem.add(girlItem);
        changeItem.add(animalItem);
        changeItem.add(sportItem);

        //将每一个选项下面的条目加入到选项中
        functionJMenu.add(changeItem);
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);


        aboutJMenu.add(accountItem);



        jMenubar.add(functionJMenu);
        jMenubar.add(aboutJMenu);

        this.setJMenuBar(jMenubar);
    }

    private void initJFrame() {
        this.setSize(603,680);

        //设置界面的标题
        this.setTitle("拼图游戏单机版 v1.0");

        //设置界面置顶
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.addKeyListener(this);

        //取消默认的居中放置
        this.setLayout(null);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //按住不松的情况
    @Override
    public void keyPressed(KeyEvent e) {
        int code=e.getKeyCode();
        if(code==65)
        {
            //对界面全部清除
            this.getContentPane().removeAll();
            //创建一个JLabel的对象（管理容器）
            JLabel all= new JLabel(new ImageIcon(path+"all.jpg"));
            //指定图片的位置
            all.setBounds(83,134,420,420);

            all.setBorder(new BevelBorder(BevelBorder.LOWERED));
            //把管理容器添加到界面中
            this.getContentPane().add(all);

            //添加背景图片
            JLabel background =new JLabel(new ImageIcon("puzzlegame/image/background.png"));
            background.setBounds(40,40,508,560);
            //把图形添加到界面当中
            this.getContentPane().add(background);
            //对界面进行刷新
            this.getContentPane().repaint();


        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        //判断游戏是否胜利，如果胜利，此方法需要直接结束，不能再执行下面的移动代码了
        if(victory())
        {
            //结束方法
            return;
        }
        //对上，下，左右进行判断
        int code=e.getKeyCode();
        //←37  →39  ↑38  ↓40
        if(code==37)
        {
            if(y!=3)
            {
                data[x][y]=data[x][y+1];
                data[x][y+1]=0;
                y++;
                //每走一步计步数1
                step++;
                initImage();
            }

        }
        else if(code==38)
        {
            //逻辑：
            //把空白方块下方的数字放上移动
            //x，y表示空白方块
            //x+1,y表示空白方块下方的数字
            if(x!=3)
            {
                data[x][y]=data[x+1][y];
                data[x+1][y]=0;
                x++;
                //每走一步计步数1
                step++;
                initImage();
            }
        }
        else if(code==39)
        {
            if(y!=0)
            {
                data[x][y]=data[x][y-1];
                data[x][y-1]=0;
                y--;
                //每走一步计步数1
                step++;
                initImage();
            }

        }
        else if(code==40)
        {
            if(x!=0)
            {
                data[x][y]=data[x-1][y];
                data[x-1][y]=0;
                x--;
                //每走一步计步数1
                step++;
                initImage();
            }
        }
        else if(code==65)
        {
            //按下A的时候
            initImage();
        }
        else if(code==87)
        {
            //按下W的时候
            data=new int[][]
                    {{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0}};
            initImage();
        }
    }
//    public void keyReleased(KeyEvent e) {
//        //对上，下，左右进行判断
//        int code=e.getKeyCode();
//        //←37  →39  ↑38  ↓40
//        if(code==37)
//        {
//            if(y!=0)
//            {
//                data[x][y]=data[x][y-1];
//                data[x][y-1]=0;
//                y--;
//                initImage();
//            }
//        }
//        else if(code==38)
//        {
//            if(x!=0)
//            {
//                data[x][y]=data[x-1][y];
//                data[x-1][y]=0;
//                x--;
//                initImage();
//            }
//        }
//        else if(code==39)
//        {
//            if(y!=3)
//            {
//                data[x][y]=data[x][y+1];
//                data[x][y+1]=0;
//                y++;
//                initImage();
//            }
//
//        }
//        else if(code==40)
//        {
//            if(x!=3)
//            {
//                data[x][y]=data[x+1][y];
//                data[x+1][y]=0;
//                x++;
//                initImage();
//            }
//        }
//    }
    //判断data数组中的数据是否跟win数组相同
    //如果全部相同，返回true，否则返回false
    public boolean victory(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (data[i][j] != win[i][j])
                    return false;
            }

        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj==replayItem)
        {
            System.out.println("重新开始");
            //计数器要清零
            step=0;

            //再次打乱二维数组中的数据
            initData();

            //重新加载图片
            initImage();
        }
        else if(obj==reLoginItem)
        {
            System.out.println("重新登录");
            //关闭当前的游戏界面
            this.setVisible(false);

            //打开登录界面
            new LoginJFrame();
        }
        else if(obj==closeItem)
        {
            System.out.println("关闭开始");
            //直接关闭虚拟机即可
            System.exit(0);

        }
        else if(obj==accountItem)
        {
            System.out.println("公众号");

            //创建一个弹窗类
            JDialog jDialog=new JDialog();
            //创建一个管理图片的容器对象JLable
            JLabel jLabel=new JLabel(new ImageIcon("puzzlegame/image/about.png"));
            //设置位置和宽高
            jLabel.setBounds(0,0,258,258);
            //把图片添加到弹框当中
            jDialog.getContentPane().add(jLabel);
            //给弹框设置大小
            jDialog.setSize(344,344);
            //让弹框置顶
            jDialog.setAlwaysOnTop(true);
            //让弹框居中
            jDialog.setLocationRelativeTo(null);
            //弹框不关闭则无法操作下面的界面
            jDialog.setModal(true);
            //让弹框显示出来
            jDialog.setVisible(true);


        }
        else if(obj==girlItem)
        {
            System.out.println("切换美女");
            //计数器要清零
            step=0;
            //随机选择图片
            Random r = new Random();
            path="puzzlegame\\image\\girl\\girl"+(r.nextInt(13)+1)+"\\";

            //再次打乱二维数组中的数据
            initData();

            //重新加载图片
            initImage();

        }
        else if(obj==animalItem)
        {
            System.out.println("切换动物");
            //计数器要清零
            step=0;
            //随机选择图片
            Random r = new Random();
            path="puzzlegame\\image\\animal\\animal"+(r.nextInt(8)+1)+"\\";

            //再次打乱二维数组中的数据
            initData();

            //重新加载图片
            initImage();

        }
        else if(obj==sportItem)
        {
            System.out.println("切换运动");
            //计数器要清零
            step=0;
            //随机选择图片
            Random r = new Random();
            path="puzzlegame\\image\\sport\\sport"+(r.nextInt(10)+1)+"\\";

            //再次打乱二维数组中的数据
            initData();

            //重新加载图片
            initImage();
        }
    }
}
