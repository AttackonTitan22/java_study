package com.zhounian.classDemo.innerclass;

public class Car {
    String carName;
    int catAge;
    String carColor;

    public Car(String carName, int catAge, String carColor) {
        this.carName = carName;
        this.catAge = catAge;
        this.carColor = carColor;
    }

    public void show(Car this){
        //是打印调用者车的名字：
        System.out.println(this.carName);
        Engine e=new Engine("劳斯莱斯",1);
        System.out.println(e.engineName);
    }
    //这是一个成员内部类
    class Engine{
        String engineName;
        int engineAge;

        public Engine(String engineName, int engineAge) {
            this.engineName = engineName;
            this.engineAge = engineAge;
        }

        public void show(){
            System.out.println(engineName);
            System.out.println(engineAge);
        }
    }

    public static void main(String[] args) {
        Car car=new Car("audi",1,"black");
        car.show();
        Engine e=car.new Engine("本田",1);
        e.show();
    }
}
