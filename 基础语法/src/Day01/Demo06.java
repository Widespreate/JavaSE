package Day01;

public class Demo06 {
    public static void main(String[] args) {
        //操作比较大的数的时候，注意溢出问题
        //JDK7的新特性，数字之间可以用_分割
        int money = 10_0000_0000;
        int year = 20;
        long total= money*((long)year);
        System.out.println(total);//-1474836480,计算时候溢出了

    }
}
