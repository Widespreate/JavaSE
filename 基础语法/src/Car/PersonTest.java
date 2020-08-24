package Car;

public class PersonTest {
    public static void main(String[] args) {
        Person per = new Person();

        Car wuling  = new Wuling() ;
        wuling.setFactoryName("五菱宏光车厂");
        per.buy(wuling);
    }
}
