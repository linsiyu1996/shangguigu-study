package com;

import java.sql.SQLOutput;

public class FamilyAccount {
    public static void main(String[] args) {
        boolean isFlag = true;
        String details="收支\t账户余额\t收支金额\t说  明\n";
        //初始金额
        int balance=10000;
        while (isFlag) {
            System.out.println("------------家庭收支记账软件------------\n");
            System.out.println("              1 收支明细");
            System.out.println("              2 登记收入");
            System.out.println("              3 登记支出");
            System.out.println("              4 退   出\n");
            System.out.print("              请输入(1-4):");
            char selection = Utility.readMenuSelection();
            switch (selection) {
                case '1':
//                    System.out.println("1收支明细");
                    System.out.println("-----------当前明细收支记录-----------");
                    System.out.println(details);
                    System.out.println("-----------------------------------");
                    break;
                case '2':
//                    System.out.println("2登记收入");
                    System.out.print("本次收入金额：");
                    int addmoney= Utility.readNumber();
                    System.out.print("本次收入说明：");
                    String addinfo=Utility.readString();
                    balance+=addmoney;
                    details+="收入\t"+balance+"\t"+addmoney+"\t\t"+addinfo+"\n";
                    System.out.println("--------------登记完成--------------");
                    break;

                case '3':
                    System.out.print("本次支出金额：");
                    int minusmoney= Utility.readNumber();
                    System.out.print("本次支出说明：");
                    String minusinfo=Utility.readString();
                    if(balance>=minusmoney){
                    balance-=minusmoney;
                    details+="收入\t"+balance+"\t"+minusmoney+"\t\t"+minusinfo+"\n";
                    }else {
                        System.out.println("支出超出账户额度，支付失败！");
                    }
                    System.out.println("--------------登记完成--------------");
                    break;
                case '4':
                    System.out.print("确认是否退出（Y/N）：");
                    char isExit = Utility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }
            }
        }
    }
}
