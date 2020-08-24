package method;

public class TestPerson {
    public static void main(String[] args) {
        Person zs = new Person();
        //对象.属性
        zs.age = 28;
        zs.name = "张三";
        //对象.方法
        zs.eat();
        zs.sleep();
        System.out.println(zs.name);
        System.out.println(zs.age);

        Person LS = new Person() ;
        LS.name ="李四" ;
        LS.age = 33 ;
        System.out.println(LS.name);
        System.out.println(LS.age);
    }
}

