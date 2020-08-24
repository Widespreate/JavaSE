package parttwo;

public class Demo05 {
    public static void main(String[] args) {
//        int i = 0 ;
//        while(i<10000){
//            System.out.println(i+"HelloWorld");
//            i++ ;//更新变量
//        }
        //2010上网人数8000万，假设每年按30%增加，问那一年人数增长到3亿

       /*
        int startnum = 8000 ;
        int year = 0 ;
        while(startnum<30000){
            year++ ;
            startnum=(int)(startnum*(1+0.3));

        }
        System.out.println(year+2010);
        */
        //计算100以内的偶数之和 2+4+6+8...100
        int sum = 0 ;
        int i =0 ;
        while(i<100){
            i++ ;
            if(i%2==0) {
                sum += i;
            }
        }
        System.out.println(sum);




    }
}
