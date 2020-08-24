package numberTest;

public class Demo02 {
    public static void main(String[] args) {
        //求5个人最高得分
        //21->28  7分钟解答排序问题
        //冒泡排序方法
        /*
        int[] scores = {97, 96, 85, 68, 100};
        int a = scores.length;
        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = 0; j < scores.length - 1 - i; j++) {
                if (scores[i] < scores[i + 1]) {
                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        System.out.println(scores[scores.length-1]);

         */
        //打擂主
        int [] nums = {87,98,67,88,99,100};
        int max = nums[0] ;
        for (int i = 0; i <nums.length-1 ; i++) {
            if(nums[i+1]>max){
                max= nums[i+1];
            }
        }
        System.out.println(max);
    }
}
