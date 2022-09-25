package com;

public class P201 {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p);
        p.sendEmail();
        p.playGame();
        //匿名对象
        /*
        * 1.理解：我们创建的对象，没有显式的赋给一个变量名，即为匿名对象
        * 2.特征：匿名对象只能调用一次
        * 3.使用：*/
        new Phone().price=1999;
        new Phone().showPrice();
        //
        PhoneMall mall=new PhoneMall();
        mall.show(new Phone());
    }
}
class PhoneMall{
    public void show(Phone phone){
        phone.sendEmail();
        phone.playGame();
    }
}
class Phone {
    double price;//价格

    public void sendEmail() {
        System.out.println("发邮件");
    }

    public void playGame() {
        System.out.println("玩游戏");
    }
    public void showPrice(){
        System.out.println("手机的价格是："+price);
    }
}
