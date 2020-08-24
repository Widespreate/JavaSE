package parttwo;

public class Demo10 {
    public static void main(String[] args) {
        //打印矩形
        /*
        for (int i = 0; i < 3; i++) {
            for (int i1 = 0; i1 < 5; i1++) {
                System.out.print("*");
            }
            System.out.println();
        }

         */
        //打印直角三角形
        /*
        for (int j = 0; j < 5; j++) {
            for(int i = 0 ; i<j+1  ; i++){//每一层很多*
                System.out.print("*");
            }
            System.out.println();
        }

 */
        //打印倒直角三角形
        /*
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i <5-j ; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

         */
        //打印菱形和空心菱形
        /*
        for (int i = 0; i < 4; i++) {//行
            for (int k = 0; k < 3 - i; k++) {//空格
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {//*
                if(j == 0 ||j == 2*i){//开头结尾打印*否则打印空格
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        for (int i = 2; i >= 0; i--) {//行
            for (int k = 0; k < 3 - i; k++) {//空格
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {//*
                if(j == 0 ||j == 2*i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

         */
        //99乘法表
        /*
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+"x"+i+"="+i*j+"\t");
            }
            System.out.println();
        }

         */
    }
}
