package com.zhounian.thread.waitandnotify;

public class Cook extends Thread{

    public Cook(String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        while (true){
            synchronized (Desk.lock){
                if(Desk.count==0){
                    break;
                }else {
                    if(Desk.foodFlag==1){
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else {
                        System.out.println(getName()+ "制作了一份面条");
                        Desk.foodFlag=1;
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
        System.out.println("厨师已经做完了"+Desk.size+"份面条！");
    }
}
