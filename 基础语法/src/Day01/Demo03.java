package Day01;

public class Demo03 {
    public static void main(String[] args) {
        //整数拓展 进制  二进制0b  十进制  八进制0  十六进制0x
        int i =10;
        int i2 =010;    //八进制0
        int i3 =0x10;  //十六进制0x  0~9 A~F
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("================");
        //============================
        //浮点型扩展? 银行业务怎么表示钱？
        //BigDecimal 数学工具类
        //============================
        //float 有限 离散 舍入误差 大约 接近但不等于
        //最好完全使用浮点数进行比较
        float f = 0.1f;
        double d = 1.0/10;
        System.out.println(f==d);//false

        float d1 = 2323412341421f;
        float d2 = d1+1;
        System.out.println(d1==d2);//true
        System.out.println("================");

        //==================================
        //字符串
        //==================================
        char c1 ='c';
        char c2 ='中';
        System.out.println((int)c1);//强制转换
        System.out.println(c2);
        //所有的字符本质还是数字
        //编码 Unicode 2字节 0~65536
        //u0000~uffff
        char c3 = '\u0064';
        System.out.println(c3);
        System.out.println("================");

        //转义字符
        // \t  制表符（8位或者是4位）
        // \n  换行
        System.out.println("hello\tWorld");
        System.out.println("hello\nWorld");

        System.out.println("================");
        String sa = new String("hello");
        String sb = new String("hello");
        System.out.println(sa==sb);//false
//
        String sc ="hello";
        String sd = "hello";
        System.out.println(sc==sd);//true
                    /*
                     主要区别是：
                    //字符串一样，但存储位置不一样，相当于当两个值
                    String a = new String("ab"); // a 为一个引用
                    String b = new String("ab"); // b为另一个引用,对象的内容一样
                    //字符串一样，存储位置也一样，相当于一个值
                    String aa = "ab"; // 放在常量池中
                    String bb = "ab"; // 从常量池中查找
                    if (aa == bb) // true
                    if (a == b) // false
                    ————————————————
                     */
        //布尔值
        boolean flag = true;
        //if(flag==true)  两种一样，代码要精简易读
        //if(flag)
    }
}
