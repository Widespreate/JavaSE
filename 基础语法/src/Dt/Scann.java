package Dt;

import java.util.Scanner;

public class Scann {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //可以输入字符串两种
        //next()不接受回车
        //nextLine()接受回车
        System.out.println();
        System.out.println("请输入姓名");
        String name = input.nextLine();
        //输入空格也行
        System.out.println(name);
        System.out.println("请输入地址");
        String address = input.next();
        //必须输入字符才行
        System.out.println(address);


        System.out.println("请输入java课程分数");
        int java = input.nextInt();
        System.out.println("请输入sql课程分数");
        int sql = input.nextInt();
        System.out.println("请输入数据结构分数");
        int math = input.nextInt();
        System.out.println("java和sql分数之和"+(java+sql));
        System.out.println("三门课平均成绩"+((java+sql+math)/3.0));
        //两种方法.结果为小数
        //1.(java+sql+math)/3.0)
        //2.((double)(java+sql+math)/3)

    }
}
