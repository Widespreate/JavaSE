package parttwo;

public class Demo07 {
    public static void main(String[] args) {
        //输入5们课程成绩，计算平均分
       /*
        Scanner input = new Scanner(System.in) ;

        int score = 0 ;
        int sum = 0 ;
        System.out.println("请输入五门课的成绩");
        for(int i = 0;i<5; i++ ){
            score = input.nextInt() ;
            sum+=score ;
        }
        //被除数是5.0把平均分小数化
        System.out.println("五门成绩的平均分为："+sum/5.0);

          */
        //求1-100 之间能被7整除的数之和
     /*
        int sun = 0;
        for (int i = 1; i <=100; i++) {
            if(i%7==0){
                sun+=i;
            }
        }
        System.out.println(sun);

      */
        //水仙花数是指一个三位数其各位数的立方等于该数本身

        for (int i = 100; i <1000 ; i++) {
            int geWei = i%10;
            int shiWei = i/10%10 ;
            int baiWei = i/100;
            if(i==(geWei*geWei*geWei)+(shiWei*shiWei*shiWei)+(baiWei*baiWei*baiWei)){
                System.out.println(i);
            }
        }
    }
}
