package method;

public class Person2 {
    public static void eatFruit(){

        System.out.println("吃水果..");
    }
    public  void eatFfood(){
        System.out.println("吃主食..");
        eatFruit();
    }
    public void sleep(){
        System.out.println("睡觉");

    }

    public static void main(String[] args) {
        Person2 p = new Person2();
       p.eatFfood();
    }
}
