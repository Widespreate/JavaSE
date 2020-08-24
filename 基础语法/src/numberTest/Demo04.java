package numberTest;

public class Demo04 {
    public static void main(String[] args) {
         int[] nums = new int[]{33,2,1,2,455} ;
        for (int i = 0; i <nums.length ; i++) {
            System.out.print(nums[i]+"\t");
        }
        for(int a:nums){
            System.out.println(a);
        }


        String[] names = new String[]{"妈妈","爸爸","爷爷","奶奶","媳妇"} ;
        for(String name:names){
            System.out.println(name);
        }


    }
}
