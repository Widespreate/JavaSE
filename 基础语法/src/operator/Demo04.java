package operator;

public class Demo04 {
    public static void main(String[] args) {
        //一元运算符
        //++自增 --自减
        int a = 3;
        int b =a++;//执行完这行代码后，先给b赋值，再自增
        //a=a+a
        int c =++a;//执行完这行代码前，再自增，先给b赋值

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
//幂运算，Math方法。 很多运算，我们会使用一些工具类
        double pow = Math.pow(2,3);
        System.out.println(pow);

    }
}
