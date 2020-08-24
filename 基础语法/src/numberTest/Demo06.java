package numberTest;

public class Demo06 {
    public static void main(String[] args) {
        //陕西  山西 四川。。。
        //西安 咸阳 。。。  成都都江堰
        String [] provinces= {"陕西","山西","四川"};
        //核心 一维数组的下标，正好是二位数组的行号
        String [] [] cities ={
                {"西安","咸阳","渭南"},
                {"太原","运城","大同"},
                {"成都","都江堰","广元"}
        };
        String p ="陕西";

        int position = -1;
        for(int i = 0 ;i<provinces.length;i++){
            if(p.equals(provinces[i] )){
                position = i ;
                break;
                //不break.就会一直循环每一次都是2
            }
        }


            System.out.println(position);
        if(position == -1){
            System.out.println("省份输入有误");
        }else{
            for (int i = 0; i <cities[position].length ; i++) {
                System.out.println(cities[position][i]);
            }
        }



    }
}
