package numberTest;

public class Demo03 {
    public static void main(String[] args) {
        //给数组中插入一个元素90，要求保持从小到大的顺序（不能用排序算法）
        int[] nums = new int[]{67,87,88,98,99} ;

        //创建新数组，能够容纳新插入后的 全部元素
        int[] newNums = new int[nums.length+1] ;
        //把旧数组的数字赋值给新数组
        for (int i = 0; i <nums.length ; i++) {
                newNums[i] = nums[i] ;
        }

        //显示新数组
        for (int i = 0; i <newNums.length ; i++) {
            System.out.println(newNums[i]);
        }
        int insert = 1000 ;
        //1.插入数组的位置
        //90：数组中国第一哥比90打的位置，就是要插入的位置
        int postion = newNums.length-1;
        for (int i = 0; i <newNums.length ; i++) {
          if(newNums[i]>insert){
              postion = i ;
              break;
          }
        }

        //2.平移(从后往前倒)
        for (int i =newNums.length-2; i>=postion ; i--) {
                newNums[i+1] =newNums[i] ;
        }
        //3.插入90
        newNums[postion] = insert ;

        for (int i = 0; i <newNums.length ; i++) {
            System.out.print(newNums[i]+"\t");
        }

    }
}
