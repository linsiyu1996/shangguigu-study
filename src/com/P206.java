package com;

public class P206 {
    public static void main(String[] args) {
        P206 test=new P206();
        test.mOL(3);
        test.mOL(2,3);
        test.mOL("3");
        System.out.println(test.max(2,4,5));
    }

    public void mOL(int x){
        System.out.println(x*x);
    }
    public void mOL(int x,int y){
        System.out.println(x*y);
    }
    public void mOL(String x){
        System.out.println(x);
    }

    public int max(int x,int y){
        return (x>y)?x:y;
    }
    public double max(double x,double y){
        return (x>y)?x:y;
    }
    public double max(double x,double y,double z){
        double max=(x>y)?x:y;
        return (max>z)?max:z;
    }
}
