package parttwo;

public class Demo06 {
    public static void main(String[] args) {
        /*
        int money = 0 ;
        Scanner input = new Scanner(System.in);

        String isContinue = "";
        do{
            System.out.println("请选择：\n1.Tshirt（100） 2.夹克（200） 3.衬衫（300）");
            int choice = input.nextInt() ;
            if(choice == 1){
                System.out.println("Tshirt\t"+100);
                money+=100;
            }else if(choice == 2){
                System.out.println("夹克\t"+200);
                money+=200;
            }else if (choice == 3){
                System.out.println("衬衫\t"+300);
                money+=300;
            }
            System.out.println("是否继续？ y/n");
            isContinue = input.next() ;
        }while(isContinue.equals("y")) ;
        System.out.println("一共消费是"+money);

        */
        //用循环实现 登录操作，若用户名、用户密码错误 则给出提示，并重新登录
         /*
        String username = "" ;
        String password = "" ;
        Scanner input = new Scanner (System.in) ;

        do{
            //如果第一次进入不显示这个if
            if(!(username.equals(""))){
                System.out.println("登录错误请重新登录");
            }
            System.out.println("请输入用户名和密码");
            username = input.next() ;
            password = input.next() ;

        }while(!(username.equals("zhao"))&&!(password.equals("123"))) ;
        System.out.println("恭喜你登录成功");
         */

        //数字反转输出， 12345->54321;
        int num = 12345;
        int real = -1 ;
        num = num * 10 ;
        while (num/10>0){
            num = num/10 ;
            real = num%10 ;
            System.out.print(real);
        }

    }
}
