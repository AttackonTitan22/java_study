package com.zhounian.lambdaDemo;

import java.util.Arrays;
import java.util.Comparator;

public class Example1 {
    public static void main(String[] args) {
        GirlFriend gf1=new GirlFriend("xiaoshishi",18,1.67);
        GirlFriend gf2=new GirlFriend("xiaodandan",19,1.72);
        GirlFriend gf3=new GirlFriend("xiaoshishi",19,1.78);
        GirlFriend gf4=new GirlFriend("abd",19,1.78);

        //定义数组存储女朋友的信息
        GirlFriend[] gfs={gf1,gf2,gf3,gf4};

        //利用Arrays中的sort进行排序
        //匿名内部类和lambda表达式
//        Arrays.sort(gfs, new Comparator<GirlFriend>() {
//            @Override
//            public int compare(GirlFriend o1, GirlFriend o2) {
//                //根据年龄大小进行排序，年龄相同，按照身高排序，身高一样按照姓名的字母进行排序
//                double temp=o1.getAge()-o2.getAge();
//                temp=(temp==0?o1.getHeight()-o2.getHeight():temp);
//                temp=(temp==0?o1.getName().compareTo(o2.getName()):temp);
//                if(temp>0)
//                    return 1;
//                else if(temp<0)
//                {
//                    return -1;
//                }
//                else
//                    return 0;
//            }
//        });
        Arrays.sort(gfs, (o1, o2)-> {
                //根据年龄大小进行排序，年龄相同，按照身高排序，身高一样按照姓名的字母进行排序
                double temp=o1.getAge()-o2.getAge();
                temp=(temp==0?o1.getHeight()-o2.getHeight():temp);
                temp=(temp==0?o1.getName().compareTo(o2.getName()):temp);
                if(temp>0)
                    return 1;
                else if(temp<0)
                {
                    return -1;
                }
                else
                    return 0;
            }
        );
        System.out.println(Arrays.toString(gfs));
    }
}
class GirlFriend{
    String name;
    int age;
    double height;

    public GirlFriend(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}