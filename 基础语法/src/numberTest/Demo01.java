package numberTest;

public class Demo01 {
    public static void main(String[] args) {
        //初识数组
        /*
        int[] students = new int[3] ;
        int sum = 0 ;
        Scanner input = new Scanner(System.in) ;
        for (int i = 0; i < students.length; i++) {//数组长度 students.length
            System.out.println("请输入第"+(i+1)+"个学生成绩");//+s:字符串拼接 数学加
            students[i]= input.nextInt() ;
            sum +=students[i] ;
        }
        System.out.println(sum);

         */
        //有一个数列：8  4  2   1  23  344  12
        //1.求所有数字的和
        //2.随机产生1-3之间的数，判断数列中是否有此数
        //3.对此数字进行排序，并输出结果
        /*
        int[] numbers = {8, 4, 2, 1, 23, 100, 12};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {//数组多少个元素从0->number.length
            sum += numbers[i];
        }
        System.out.println(sum);
        System.out.println(numbers.length);
        System.out.println("-------------");

        boolean flag = false ;//两种可能就考虑用布尔值
        int ran = (int) (Math.random() * 3) + 1;//1-3的随机数
        System.out.println(ran);
        for (int i = 0; i < numbers.length; i++) {
            if (ran == numbers[i]) {
                flag=true;
                break;
            }
        }if(flag){
            System.out.println("存在");
        }else{
            System.out.println("不存在");
        }

        System.out.println("-------------");

         */
        int[] numbers = {8, 4, 2, 1, 23, 100, 12};
        System.out.println("-------------");
        System.out.println("排序前");
        for (int i = 0; i <numbers.length ; i++) {
            System.out.print(numbers[i]+"\t");
        }
        //排序
       // Arrays.sort(numbers) ;   //自动排序，升序，api开发
        //自己写排序算法，冒泡排序

        for (int i = 0; i <numbers.length-1 ; i++) {
            for (int j = 0; j <numbers.length-1-i ; j++) {
                if(numbers[j]>numbers[j+1]){
                    int temp = numbers[j] ;
                    numbers[j] = numbers[j+1] ;
                    numbers[j+1] = temp ;
                }
            }
        }
        System.out.println("\n-------------");
        System.out.println("排序后");
        for (int i = 0; i <numbers.length ; i++) {
            System.out.print(numbers[i]+"\t");
        }

    }
}
