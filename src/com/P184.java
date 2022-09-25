package com;
/*
* 类中方法的声明和使用
* 方法：描述类应该具备的功能
* 1.举例：
* public void eat(){}
* public void sleep(int hour){}
* public String getName(){}
* public String getNation(String nation){}
* 2.方法的声明：
* 权限修饰符 返回值类型 方法名（形参列表）{
*           方法体;
*   }
* 注意：static、final、abstract 来修饰方法，后面讲。
* 3.说明
* 1）关于权限修饰符：默认方法的权限修饰符先都使用public
* java规定的4种权限修饰符：private、public、缺省、protected
* 2）返回值类型：有返回值 vs 没有返回值
* 2.1）
* a.如果方法有返回值，则必须在方法声明时，指定返回值的类型，同时，方法中需要使用return关键字来返回指定类型的变量或常量。
* b.如果方法没有返回值，则方法声明时，使用void来表示，通常没有返回值的，方法中就不需要使用return了，但是如果使用的话，只能”return;“,表示结束此方法的意思。
* 2.2)我们定义方法该不该有返回值？
* a.题目要求
* b.凭经验：具体问题具体分析
* 3）方法名：属于标识符，遵循标识符的规则和规范，”见名知意“
* 4）形参列表:方法可以声明0个，1个，或多个形参
* 4.1)格式：数据类型1 形参1，数据类型2 形参2，...，数据类型n 形参n
* 4.2)我们定义方法时，该不该定义形参？
* a.题目要求
* b.凭经验：具体问题具体分析
* 5)方法体：方法功能的体现
* 4.return关键字的使用：
* 1）.使用范围：使用在方法体中
* 2）.作用：结束方法
*         针对于有返回值类型的方法，使用”return 数据;“方式，返回所要的数据
* 3）.注意点:return关键字后面不可以声明执行语句。
* 5.方法的使用中，可以调用当前类的属性和方法
* 特殊的：方法A中又调用了方法A(递归方法)
* 方法中不可以定义方法
* */
public class P184 {
    public static void main(String[] args) {
        Customer cust1=new Customer();
        cust1.eat();
        cust1.sleep(8);
    }
}
class Customer{
    //属性
    String name;
    int age;
    boolean isMale;
    //方法
    public void eat(){
        System.out.println("客户吃饭");
    }
    public void sleep(int hour){
        System.out.println("客户休息了"+hour+"小时");
        eat();
    }
    public String getName(){
        return name;
    }
    public String getNation(String nation){
        String info="客户的国籍是"+nation;
        return info;
    }
}