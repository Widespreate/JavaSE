package anmal;

public class Manger {
    public void feed(Animal animal){
        System.out.println("喂"+animal.getName());
        animal.eat();
    }
}
