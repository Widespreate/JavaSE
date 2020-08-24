package operator;

public class Demo02 {
    public static void main(String[] args) {
        long a = 121312312313L;
        int b = 123;
        short c= 10;
        byte d = 8;
        //一般输出结构都为Int除了有Long/Double类型的

        System.out.println(a+b+c+d);//Long
        System.out.println(b+c+d);//int
        System.out.println(c+d);//int
    }
}
