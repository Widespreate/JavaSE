package numberTest;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        /*
        抽奖游戏
        1.注册  2.登录  3.抽奖

        注册时，系统会自动生成一个4位随机数作为卡号

        登陆成功后，才能抽奖

        抽奖时，系统生成6个4位随机数作为幸运数字
        如果是会员卡号其中之一，则成为本次幸运会员
        否则不是幸运会员
         */

        String registName = "" ;
        String password = "" ;
        Scanner input = new Scanner(System.in) ;
        System.out.println("注册");
        System.out.println("请输入用户名");
        registName = input.next();
        System.out.println("请输入密码");
        password = input.next();
        System.out.println("注册完毕");

        int vipnumber = (int)(Math.random()*9000)+1000 ;

        String loginName = "" ;
        String loginPwd = "" ;
        System.out.println("登录");
        System.out.println("登录用户名");
        loginName = input.next();
        System.out.println("登录密码");
        loginPwd = input.next();
        if(loginName.equals(registName) && loginPwd.equals(password)){
            System.out.println("登陆成功");
            System.out.println("可以抽奖");
            //产生6个幸运号码
            int[] lucyNums = new int[6];
            for (int i = 0; i <6 ; i++) {
                lucyNums[i] = (int)(Math.random()*9000)+1000 ;
                System.out.println(lucyNums[i]+"\t");
            }

            System.out.println("你的vipNum"+vipnumber);
            boolean flag = false ;
            //判断vipnumber是否在lucyNumber中
            for(int i = 0 ;i<6;i++){
                if (vipnumber == lucyNums[i]){
                    flag= true ;
                }
            }
            if(flag){
                System.out.println("中奖");
            }else{
                System.out.println("没中奖");
            }
        }else{
            System.out.println("请重新输入");
        }

    }
}
