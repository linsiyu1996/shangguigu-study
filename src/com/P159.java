package com;

public class P159 {
    public static void main(String[] args) {
        int[] arr=new int[10];
        int sum=0;
        for (int i=0;i<arr.length;i++) {
            arr[i] = (int) (Math.random() * (99 - 10 + 1) + 10);
            System.out.print(arr[i] + " ");
        }
        int max=arr[0];
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            sum+=arr[i];

        }
        System.out.println();
        System.out.print("max："+max+",min:"+min+",sum:"+sum);

    }
}
