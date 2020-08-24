package Dt;

import java.util.Scanner;

public class OpreatorPractive {
    public static void main(String[] args) {
        //46天，包含了几周几天
        int day = 46 ;
        int  week = 46 / 7 ;
        int  days = 46 % 7 ;
        System.out.println("46天有"+week+"周"+"有"+days+"天");

        //商场活动100当作120花，420元的衣服付多少钱？
        int a = 420/120;
        int b = 420%120;
        System.out.println(a*100+b);

        //输入张三成绩，与李四成绩（80），输出，张三是否比李四的分数多？
        Scanner input = new Scanner(System.in);
        int lisi = 80  ;
        System.out.println("请输入张三分数");
        int zs = input.nextInt() ;
        String end  = zs>lisi?"张三分数大于李四":"李四分数大于张三";
        System.out.println(end);

        //输入三位数，求各个位数之和
        Scanner input1 = new Scanner(System.in);
        int q = input1.nextInt() ;
        int w = input1.nextInt() ;
        int e = input1.nextInt() ;
        System.out.println("三个数字百位数之和为:"+(int)(q/100+w/100+e/100));
        System.out.println("三个数字十位数之和为:"+(int)(q/10+w/10+e/10));
        System.out.println("三个数字个位数之和为:"+(int)(q%10+w%10+e%10));
        //两个数交换
        System.out.println("请输入一个两位数");
        int t = input1.nextInt();
        System.out.println("交换过的数字为："+t%10+t/10);
        //一个五位数求各个位数之和
        int aaa = 12345;
        int geWei = aaa/1 %10;
        int shiWei = aaa/10 %10;
        int baiWei = aaa/100 %10;
        int qianWei = aaa/1000 %10;
        int wanWei = aaa/10000 %10;
        System.out.println(geWei+shiWei+baiWei+qianWei+wanWei);

        //两个数交换
        //1.方法一
        int num1 = 10 ;
        int num2 = 20 ;
        int temp = num1 ;
            num1 = num2;
            num2 = temp ;
        System.out.println(num1);
        System.out.println(num2);
        //方法二
        num1 = num1 + num2 ;//30
        num2 = num1 - num2 ;//10
        num1 = num1 - num2;//20

        //方法三
        num1 = num1 ^ num2 ;
        num2 = num1 ^ num2 ;
        num1 = num1 ^ num2 ;
        //最大值的下一位是最小值（溢出问题）
        int max = Integer.MIN_VALUE;
        System.out.println(max+1);

    }
}
