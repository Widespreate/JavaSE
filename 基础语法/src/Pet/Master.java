package Pet;

public class Master {
    //这就是多态
  //第一次
    //Pet pet = new Dog();
  //第二次
    //Pet pet  = new Penguin();
    public void feed(Pet pet){
        System.out.println("喂"+pet.getName());
        pet.eat();
    }
}
