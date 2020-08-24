package Pet;

public class TestMaster {
    public static void main(String[] args) {
            Master master = new Master();

            Pet dog = new Dog();
            dog.setName("狗");
            Pet penguin = new Penguin();
            penguin.setName("企鹅");
            master.feed(dog);
            master.feed(penguin);
    }
}
