package 猜拳游戏;

import java.util.Scanner;

public class User {
    String name ;
    int score ;
    public int showFit(){
        Scanner input = new Scanner(System.in);
        System.out.println("游戏规则：1.石头\t2.剪刀\t3.布");
        System.out.println("请出拳");
        int chices = input.nextInt();
        if(chices ==1){
            System.out.println("您出了石头");
        }else if(chices ==2){
            System.out.println("您出了剪刀");
        }else if(chices ==3){
            System.out.println("您出了布");
        }else{
            System.out.println("输入错误");
        }
        return chices ;
    }
}
