package com;

public class P189 {
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.radius=2;
        double area=c1.findArea();
        System.out.println(area);
    }
}
class Circle{
    //属性
    double radius;
    //求圆的面积
    public double findArea(){
        double area=3.14*radius*radius;
        return area;
    }

}