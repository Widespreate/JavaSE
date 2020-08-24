package 石头剪刀布;

import java.util.Scanner;

public class Game {
    User user;
    Computer computer ;
    int count ; //对战次数
    //初始化：这集自己的名字，积分0 ；
    public void init(){
        System.out.println("请输入你的姓名");
       Scanner input = new Scanner(System.in) ;
        String name = input.next() ;
        //创建对象，不然报空指针
        user = new User();
        user.name = name ;
        //初始分数
        user.score = 0 ;
        //创建对象，不然报空指针
        computer =new Computer();
        computer.score =0 ;
        System.out.println("请选择你的对手：\n1.张三\t2.李四\t3.王五");
        int choice = input.nextInt() ;
        switch (choice){
            case 1:
                computer.name= "张三";
                break;
            case 2:
                computer.name= "李四";
                break;
            case 3:
                computer.name="王五";
                break;
            default:
                System.out.println("输入错误");
        }
        System.out.println("您选择了与TA对战:"+computer.name);
    }


    public  void start(){
            init();
        boolean flag = true;
        Scanner input = new Scanner(System.in) ;
            while(flag){
                int userFist =   user.showFist();
                int computerFist =  computer.showFist();
                calcResult(userFist,computerFist);
                System.out.println("是否要继续游戏？Y/N");
                String yesno = input.next() ;
                count++;
                if(yesno.equals("Y")){
                    System.out.println("继续出拳");
                }else{
                    break;
                }
            }
          showResult(user,computer);
    }

    //计算最终结果
    public void calcResult(int userFist,int computerFist){
        //1剪刀，2石头，3布
        if((userFist==1 && computerFist==3)||(userFist==2&&computerFist==1)||(userFist==3&&computerFist==2)){
            System.out.println("您赢了");
            user.score++ ;
        }else if((userFist==1 && computerFist==2)||(userFist==2&&computerFist==3)||(userFist==3&&computerFist==1)){
            System.out.println("电脑赢了");
            computer.score++;
        }else{
            System.out.println("平局");
        }
    }

    //显示最终结果
    public void showResult(User user,Computer computer){
        if(user.score>computer.score){
            System.out.println(user.name+"一共玩了"+count+"次");
            System.out.println("您获胜了");
            System.out.println("您得了"+user.score+"分");
        }else if(computer.score>user.score){
            System.out.println("一共玩了"+count+"次");
            System.out.println("很遗憾电脑获胜了");
            System.out.println("您得了"+computer.score+"分");
        }else if(computer.score==user.score){
            System.out.println("一共玩了"+count+"次");
            System.out.println("平局");
        }
    }

    public static void main(String[] args) {
       Game game  = new Game() ;
       game.start();
    }
}
