package method;

public class Person3 {
    public void a(){
        Person2 p = new Person2();
        p.eatFruit();

        Person2.eatFruit();
    }
    public void b(){

    }

    public static void main(String[] args) {
        Person3 p =new Person3();
        p.a();
    }
}
