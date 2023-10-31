package com.zhounian.extenddemo;

public class ExtendDemo5 {
    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner obj = new InheritInner(wi);
    }
}

class WithInner {
    WithInner(){
        System.out.println("我是外部类");
    }
    class Inner{
        Inner(){
            System.out.println("我是内部类");
        }
    }
}
class InheritInner extends WithInner.Inner {

    // InheritInner() 是不能通过编译的，一定要加上形参
    InheritInner(WithInner wi) {
        wi.super(); //必须有这句调用
        System.out.println("我是内部类的子类");

    }
}
