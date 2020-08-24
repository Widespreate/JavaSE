package parttwo;

import java.util.Scanner;

public class Demo08 {
    public static void main(String[] args) {
       /*
        for (int i = 0; i <5 ; i++) {
            if(i==2){
                continue;
            }
            System.out.println(i);


        }
  */

        //1.循环录入五门课程的成绩，并计算平均分，如果某一门输入课程分为负数要求停止输入
    /*
        Scanner input = new Scanner(System.in);
        boolean flag = true; //默认正常5个成绩全部录入成功
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("请输入第" + i + "门成绩");
            int a = input.nextInt();
            if (a < 0) {
                System.out.println("输入错误，停止！");
                flag = false ;
                break;
            }
            sum = sum + a;
        }
        if (flag) {
            System.out.println("总分" + sum);
            System.out.println(sum / 5.0);
        }else{
            System.out.println("输入有误");
        }

     */
        //1-20,累加，累加到那个数字时刚好大于30
      /*  int sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum += i;
            if (sum > 30) {
                System.out.println(i);
                break;
            }
        }

       */
        //用户登录验证（zs,abc）,验证次数最多3次；

        Scanner input = new Scanner(System.in);
        boolean flag = true ;
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String name = input.next();
            System.out.println("请输入密码");
            String password = input.next();
            if (name.equals("zs") && password.equals("abc")) {
                System.out.println("登录成功");
                flag =false ;
                break;
            }else{
                System.out.println("登陆失败");
            }
        }
        if(flag){
            System.out.println("输入三次密码失败");
        }

    }
}
