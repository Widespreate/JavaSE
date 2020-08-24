package hello.world;

public class Person {
    private String name;
    private int age;

    //set:增删改,赋值
    //get:查

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;//this.name代表了当前类的属性
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

