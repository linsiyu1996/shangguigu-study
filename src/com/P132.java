package com;

public class P132 {
    public static void main(String[] args) {
        int factor=0;
        for(int i=1;i<=1000;i++){
            for(int j=1;j<i;j++){
                if(i%j==0){
                    factor+=j;
                }
            }
            if (i==factor){
                System.out.println(i);
            }

        }


    }
}
