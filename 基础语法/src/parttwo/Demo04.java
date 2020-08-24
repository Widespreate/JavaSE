package parttwo;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        //排名1，夏令营  2.笔记本电脑 3. U盘
        //if方法
        /*
        int rank = 2 ;
        if(rank == 1){
            System.out.println("夏令营");
        }else if(rank == 2){
            System.out.println("笔记本电脑");
        }else if(rank == 3){
            System.out.println("U盘");
        }
        */
        //switch方法
        int rank = 2;
        switch (rank) {
            case 1:
                System.out.println("笔记本电脑");
                break;
            case 2:
                System.out.println("U盘");
                break;
            case 3:
                System.out.println("夏令营");
                break;//break表示整个switch全部结束
            default:
                System.out.println("不奖励");
                break;

        }

        Scanner input = new Scanner(System.in);
        //input方法hasNextInt()判断输入是否为数字
        if (input.hasNextInt()) {
            int mon = input.nextInt();
            switch (mon) {

                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("是大月");
                    break;
            }
        }else{
            System.out.println("请输入数字");
        }

    }

}
