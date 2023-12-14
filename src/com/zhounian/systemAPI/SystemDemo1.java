package com.zhounian.systemAPI;



public class SystemDemo1 {
    public static void main(String[] args) {
        // 定义源数组
        int[] srcArray = {54 , 99 , 21347 , 6439 , 144 , 6 } ;
        // 定义目标数组
        int[] desArray = new int[10] ;
        // 进行数组元素的copy
        System.arraycopy(srcArray , 0 , desArray , 3 , 4);
        // 遍历目标数组
        for(int x = 0 ; x < desArray.length ; x++) {
            if(x != desArray.length - 1) {
                System.out.print(desArray[x] + ", ");
            }
            else {
                System.out.println(desArray[x]);
            }

        }


        long start = System.currentTimeMillis();
        int sum = 0;
        for (int i = 1; i <= 100000; i++) {
            sum +=i;
        }
        //获取程序运行的总时间
        long end = System.currentTimeMillis();
        System.out.print("运行该程序需要：");
        System.out.print(end - start);
        System.out.println("毫秒");


        System.out.println("----------程序开始执行----------");
        // 终止JVM
        System.exit(0);
        System.out.println("----------程序终止----------");


        //public static native void arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
        //细节：
        //1.如果数据源数组和目的地数组都是基本数据类型，那么两者的类型必须保持一致，否则会报错
        //2.再拷贝的时候需要考虑数组的长度，如果超出范围也会报错
        //3.如果数据源数组和目的地数组都是引用数据类型，那么子类类型可以复制非父类类型

        Student s1=new Student("zhangsan",23);
        Student s2=new Student("lisi",24);
        Student s3=new Student("wangwu",25);

        Student[] arr1={s1,s2,s3};


    }

}

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}