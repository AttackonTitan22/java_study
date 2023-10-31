package com.zhounian.interfacetest;

public class MammalInt implements Animal{
    public void eat(){
        System.out.println("Mammal eats");
    }

    public void travel(){
        System.out.println("Mammal travels");
    }

    public int noOfLegs(){
        return 0;
    }

    public static void main(String args[]){
        MammalInt m = new MammalInt();
        m.eat();
        m.travel();
        Abstractclass_sub as=new Abstractclass_sub();
        as.homeGoalScored();
        as.setHomeTeam("验证");
        as.setVisitingTeam("yazheng");
        Sports.staticmethod();
        as.get("这个是默认方法");
        Animal al=new Animal() {
            @Override
            public void eat() {
                System.out.println("Animal eat");
            }

            @Override
            public void travel() {
                System.out.println("Animal travel");
            }
        };
        al.eat();
        al.travel();
    }
}
abstract class Abstractclass implements Sports{

    public Abstractclass(){
        System.out.println("Abstractclass()");
        System.out.println(this.name);

    }

    abstract void homeGoalScored();

}

class Abstractclass_sub extends Abstractclass{
    public Abstractclass_sub(){
        System.out.println("Abstractclass_sub()");
    }
    void homeGoalScored()
    {
        System.out.println("homeGoalScored()");
    }
    public void setHomeTeam(String name){
        System.out.println("setHomeTeam"+name);
    }
    public void setVisitingTeam(String name){
        System.out.println("setVisitingTeam"+name);
    }
}