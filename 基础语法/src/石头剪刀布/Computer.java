package 石头剪刀布;

public class Computer {
    String name;
    int score;

    public int showFist() {
        //随机产生随机数
        int choice = (int)(Math.random()*3)+1;
        if (choice == 1) {
            System.out.println(name+"电脑出了剪刀");
        } else if (choice==2) {
            System.out.println(name+"电脑出了石头");
        }else if(choice==3){
            System.out.println(name+"电脑出了布");
        }else{
            System.out.println("输入有误");
        }
        return choice;
    }
}
