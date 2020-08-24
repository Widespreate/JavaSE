package numberTest;

public class Test {
    public static void main(String[] args) {

        int[] newNumber = {3,6,4};
        System.out.println("排序前------");
        for (int i = 0; i <newNumber.length ; i++) {
            System.out.print(newNumber[i]+"\t");
        }
        System.out.println();
        System.out.println("求出最大值");
        int max = 0 ;
        for (int i = 0; i <newNumber.length ; i++) {
            if(max<newNumber[i]){
                max = newNumber[i]  ;
            }
        }

        System.out.println(max);


        System.out.println("求出小值");
        int min = 10 ;
        for (int i = 0; i <newNumber.length ; i++) {
            if(min>newNumber[i]){
                min = newNumber[i]  ;
            }
        }
        System.out.println(min);


        int sum = 0 ;
        for (int i = 0; i <newNumber.length ; i++) {
            sum+=newNumber[i] ;
        }
        int  mid = (sum-max-min) ;
        System.out.println("排序后------");
        System.out.println(max+"\t"+mid+"\t"+min);

    }
}
