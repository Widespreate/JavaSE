package 猜拳游戏;

public class Computer {
    String name;
    int score;

    public int showFit() {
        int ran = (int)Math.random()*3+1;

            switch (ran){
                case 1:
                    System.out.println("电脑出了石头");
                    break;
                case 2:
                    System.out.println("电脑出了剪刀");
                    break;
                case 3:
                    System.out.println("电脑出了布");
                    break;
                default:
                    System.out.println("输入错误");
                    break;
            }
            return ran;
    }
}
