package parttwo;

public class Demo02 {
    public static void main(String[] args) {
//        double ran = Math.random() ;
//        System.out.println(ran);
        //残生四位随机数
        //0-1 *9000 -->[0, 9000) ->int -->[0,8999] +1000 -->[1000,9999]
 //       System.out.println((int)(Math.random()*9000)+1000);

        //会员卡号必须是三位：
        //抽奖规则，如果卡号的十位等于随机数，则中奖
        int vip = (int)(Math.random()*900)+ 100 ;
        int shiwei = vip/10%10;
        int ran = (int) (Math.random()*10) ;//0-9 注意括号
        if(shiwei == ran){
            System.out.println("中奖");
        }else{
            System.out.println("没中奖");
        }
        System.out.println("具体如下：卡号"+ vip+"幸运数字"+ran);


    }
}
