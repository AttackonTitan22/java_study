package com.zhounian.GenericMethodDemo;

public class Box <T>{
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

//        integerBox.add(new Integer(10));
//        stringBox.add(new String("菜鸟教程"));

        //这是因为Java中的自动装箱（Autoboxing）功能可以将基本类型自动转换为对应的包装类对象。
        // 因此，你可以直接传递基本类型的值给泛型类的 add 方法，
        // 而无需显式地创建包装类对象。在这种情况下，编译器会自动将基本类型值包装为对应的包装类对象。
        integerBox.add(10);
        stringBox.add("菜鸟教程");

        System.out.printf("整型值为 :%d\n\n", integerBox.get());
        System.out.printf("字符串为 :%s\n", stringBox.get());
    }
}
