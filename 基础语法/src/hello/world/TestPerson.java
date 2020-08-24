package hello.world;

public class TestPerson {
    public static void main(String[] args) {
        Person per = new Person();
        per.setName("zs");
        per.setAge(140);
        System.out.println(per.getAge() + "----" + per.getName());
    }
}
