package com;
/*
 * 一、java面向对象学习的三条主线
 * 1、java类及类的成员：属性,方法，构造器；代码块，内部类
 * 2、面向对象的三大特征：封装，继承，多态
 * 3、其他关键字：
 *
 * 三、面向对象的两个要素
 * 类：对一类事物的描述，是抽象的、概念上的定义
 * 对象：是实际存在的该类事物的每个个体，因此也称为实例（instance）
 * 》面向对象程序设计的重点就是类的设计
 * 》设计类，就是设计类的成员
 *  //属性：对应类中的成员变量（field，域，字段）
    //行为：对应类中的成员方法（函数，方法，method）
    创建类的对象=类的实例化=实例化类
 * 1.类和对象的使用（面向对象思想落地的实现）：
 * 1）创建类，设计类成员
 * 2）创建类的对象
 * 3）通过“对象.属性”或“对象.方法”调用对象的结构
 * 2.如果创建了一个类的多个对象，则每个对象都独立拥有一套类的属性（非static的）
 * 意味着如果我们修改一个对象属性a的值，不影响另一个对象属性a的值
 * 3、内存解析
 * */

public class P174 {
    public static void main(String[] args) {
        //创建person类的对象
        Person p1=new Person();
        //调用对象的结构：属性，方法
        //调用属性：对象.属性
        p1.name="Tom";
        p1.isMale=true;
        System.out.println(p1.name);
        //调用方法：对象.方法
        p1.eat();
        p1.sleep();
        p1.talk("中文");
        //**********************************
        Person p2=new Person();
        System.out.println(p2.name);//null
        System.out.println(p2.isMale);//false
        //将p1变量保存的地址值赋给p3,导致p1和p3指向了堆空间的同一个对象实体
        Person p3=p1;
        System.out.println(p3.name);//Tom
        p3.age=10;
        System.out.println(p1.age);//10
    }

}
class Person{
    //属性
    String name;
    int age=1;
    boolean isMale;
    //方法
    public void eat(){
        System.out.println("人可以吃饭");
    }
    public void sleep(){
        System.out.println("人可以睡觉");
    }
    public void talk(String language){
        System.out.println("人可以说话，使用的是："+language);
    }
}