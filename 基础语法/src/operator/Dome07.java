package operator;

import java.util.function.DoubleToIntFunction;

public class Dome07 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a+=b;
        a-=b;
        System.out.println(a);

        //字符串连接符 + ，String
        //面试题
        System.out.println(""+a+b);
        System.out.println(a+b+"");

    }
}
