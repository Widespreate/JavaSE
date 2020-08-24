package parttwo;

import java.util.Scanner;

public class MyCalender {
    public static void main(String[] args) {
        //已经知道1900年1月1日是周一
        //输入年和月（2019，10）-》系统自带打印当月月历
        //第一步？知道当月1号是周几！推
        /*
        做循环不怕麻烦
         */
        Scanner input = new Scanner(System.in) ;

        int days = 0;
        System.out.println("请输入一个年");
        int year = input.nextInt();
        if(!(year>=1900 && year<9999)){
            System.out.println("请输入正确的年份");
        }
        System.out.println("请输入一个月份");
        int month = input.nextInt();

        if(!(month<1&& month>12)){
            System.out.println("请输入正确的月份");
        }
        //1900-2018整个包含的天数
        for (int i = 1900; i < year; i++) {
            //如果一个年份能够被4整除 且不能被100整除： 或 一个数字能被400整除
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                days += 366;
            } else {
                days += 365;
            }
        }
        //2019.1.1->2019.9.30
        for (int i1 = 0; i1 < month; i1++) {
            switch (i1) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days += 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days += 30;
                    break;
                default:
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                        days += 29;
                    } else {
                        days += 28;
                    }

            }
        }


        int xingQi = days % 7;
        System.out.println(year+"年"+month+"月"+"1号是星期" + xingQi);

        //根据观察可得：星期几 前面有几个空格（占位符）=星期几
        //在打印数字
        System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t");
        //打印星期头
        for (int i = 0; i < xingQi; i++) {
            System.out.print("\t\t");
        }
        //当月多少天
            int daysOfMonth = -1 ;
        if (month == 1 || month == 3 || month == 4 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            daysOfMonth = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11 ) {
            daysOfMonth = 30 ;
        } else {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                daysOfMonth = 29 ;
            } else {
                daysOfMonth = 28  ;
            }
        }
        for (int i = 1; i <= daysOfMonth; i++) {
            System.out.print(i + "\t\t");
            if ((xingQi + i) % 7 == 0) {
                System.out.println();
            }
        }
    }
}
