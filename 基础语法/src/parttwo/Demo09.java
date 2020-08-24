package parttwo;

import java.util.Scanner;

public class Demo09 {
    public static void main(String[] args) {
        //一重循环 4个同学，计算平均分
        /*
        Scanner input = new Scanner(System.in) ;
        int sum = 0 ;
        int score  = 0 ;
        for (int i = 0; i < 4; i++) {
            System.out.println("请输入第"+(i+1)+"名学生的成绩");
            score = input.nextInt() ;
            sum+=score ;
        }
        System.out.println(sum/4.0);
         */
        //3各班级，各个班有四个同学，求每个班的平均分
        Scanner input = new Scanner(System.in) ;
        for (int j = 0; j < 3; j++) {
            System.out.println("请输入第"+(j+1)+"的班的成绩");
            int sum = 0 ;
            int score  = 0 ;
            for (int i = 0; i < 4; i++) {
                System.out.println("请输入第"+(i+1)+"名学生的成绩");
                score = input.nextInt() ;
                sum+=score ;
            }
            System.out.println(sum/4.0);
        }

    }
}
