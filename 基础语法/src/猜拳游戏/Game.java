package 猜拳游戏;

import java.util.Scanner;

public class Game {
    Computer computer;
    User user;
    //记录分数
    int count;

    public void init() {
        System.out.println("请输入你的姓名");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        //初始化值
        user = new User();
        user.name = name;
        //初始化值
        user.score = 0 ;
        computer = new Computer();
        computer.score = 0 ;
        System.out.println("请选择您要对战的电脑1.张三\t2.王五\t3.赵六");
        int  com  = input.nextInt();
        if(com==1){
            computer.name="张三";
        }else if(com==2){
            computer.name = "王五";
        }else if(com==3){
            computer.name = "赵六" ;
        }else{
            System.out.println("输入错误请重新输入");
        }

    }

    public void start() {
        init();
        //作用域太小提到此处
        String isContinue = "" ;
        Scanner input = new Scanner(System.in);
        do{
        int userfit = user.showFit();
        int computerfit = computer.showFit();
        calcWin(userfit,computerfit);
        System.out.println("请选择是否继续游戏Y（继续）/N（终止）");
         isContinue = input.next() ;
            count++;
        }while("Y".equals(isContinue));
        whoWin(user,computer);
    }
   // 1.石头	2.剪刀	3.布
    //计算每一轮结果
    public void calcWin(int userfit,int computerfit) {
            if((userfit==1&&computerfit==2)||(userfit==2&&computerfit==3)||(userfit==3&&computerfit==1)){
                System.out.println("你赢了");
                user.score++;
            }else if((computerfit==1&&userfit==2)||(computerfit==2&&userfit==3)||(computerfit==3&&userfit==1)){
                System.out.println("电脑赢了");
                computer.score++;
            }else{
                System.out.println("平局");
            }

    }
//计算最终结果
    public void whoWin(User user,Computer computer) {
            if(user.score>computer.score){
                System.out.println("一共玩了"+count+"局最终"+user.name+"您以"+ user.score+":"+computer.score+"取得了最终的胜利");
            }else if(computer.score>user.score){
                System.out.println("一共玩了"+count+"局最终"+computer.name+"电脑以"+ computer.score+":"+user.score+"取得了最终的胜利");
            }else{
                System.out.println("您与电脑是平局");
            }
    }
    public static void main(String[] args) {
        Game game = new Game();
        game.start();

    }
}
