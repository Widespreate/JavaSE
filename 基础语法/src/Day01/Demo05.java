package Day01;

public class Demo05 {
    public static void main(String[] args) {

        int i = 128;
        //强制转换（类型）变量名
        byte b = (byte)i;
        System.out.println(i);
        System.out.println(b);//内存溢出，byte最大值是127


        System.out.println("==========");


        float a = 23.2f;
        int w = (int)a;
        System.out.println(w);
        //23小数点没了，丢失精度

        System.out.println("==========");

        char c = 'a';
        int g = c+1;
        System.out.println(g);
        System.out.println((char)g);
        /*
        注意点：
        1.不能用布尔值进行转换
        2.不能把对象类型转换为不相干的类型
        3.在把高容量转换到低容量的时候，强制转换
        4.转换的时候可能存在内存溢出，精度问题
         */
    }
}
