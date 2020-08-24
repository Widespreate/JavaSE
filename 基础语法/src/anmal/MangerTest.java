package anmal;

public class MangerTest {
    public static void main(String[] args) {
        Manger manger = new Manger() ;

        Animal pig = new Pig() ;
        pig.setName("猪猪侠");
        manger.feed(pig);

        Animal monkey = new Monkey() ;
        monkey.setName("孙悟空");
        manger.feed(monkey);
    }
}
