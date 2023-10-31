package com.zhounian.interfacetest;

public class InterfaceTest {
    public static void main(String[] args) {
        //后面加花括号这种写法，实际是new了一个实现接口的匿名类，开发人员需要在匿名类内部（花括号内）实现你那个接口。
        INtf in =new INtf() {
            @Override
            public void func() {
                System.out.println("这是override接口中方法的结果");
            }
        };

        in.func();
        //等价于  这是将接口类型绑定在一个以此为接口实现的对象上了
        INtf in5 =new do_INtf();
        in5.func();
        INtf in2=new INtf_sub() {
            @Override
            public void func2() {
                System.out.println("这是override接口中func2方法的结果");
            }

            @Override
            public void func() {
                System.out.println("这是override接口中func方法的结果2");
            }
        };
        in2.func();
        //in2.func2();
        INtf_sub in3=new INtf_sub() {
            @Override
            public void func2() {
                System.out.println("这是类型为INtf_sub，override接口中func2方法的结果");
            }

            @Override
            public void func() {
                System.out.println("这是类型为INtf_sub，override接口中func方法的结果2");
            }
        };
        in3.func2();
        in3.func();
        // INtf in4=new Intf();报错
        INtf_sub in6=new do_INft_sub();
        in6.func2();
        in6.func();
    }
}

interface INtf{
    String name="接口名字";
    public void func();
    public static void func_static(){
        System.out.println("这是静态方法");
    }
}

interface INtf_sub extends INtf{
    public void func2();
}

class do_INtf implements INtf{
    public void func() {
        System.out.println("这是定义类去实现接口INft方法");
    }
}

class do_INft_sub implements INtf_sub{
    public void func() {
        System.out.println("这是定义类去实现接口INft_sub方法func");
    }
    public void func2(){
        System.out.println("这是定义类去实现接口INft_sub方法func2");
    }
}
