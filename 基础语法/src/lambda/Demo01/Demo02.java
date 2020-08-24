package lambda.Demo01;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public  class Demo02 {
    public static void test03(){
        //消费性
        //相当于实现了  Consumer 中的void accept(T t);
        Consumer<String> c = (x)->{System.out.println("吃"+x);};
        c.accept("苹果");

    }

    public static  void test04(){
        //供给型
        Supplier<Integer> supplier = ()->  (int)(Math.random()*9000+1000);
        System.out.println(supplier.get());
    }


    public static void test05(){
        Function<String,String> function = (s)->s.toUpperCase();
        String a =  function.apply("hello world");
        System.out.println(a);
    }

    public static void main(String[] args) {

        test03();//吃苹果
        test04();//四位随机数
        test05();//HELLO WORLD

    }
}
