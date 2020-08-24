package Car;

public class Person {
    public void buy(Car car){
        System.out.println("在"+car.getFactoryName());
        car.carFactory();
    }
}
