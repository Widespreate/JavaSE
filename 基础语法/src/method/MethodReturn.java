package method;

public class MethodReturn {
    public String a1() {
        String name = "zs";
        System.out.println(name);
        //返回值
        return name;
    }

    public void b() {
        //接收
        String name = a1();
        System.out.println("c" + name);
    }

    public static void main(String[] args) {
        MethodReturn method = new MethodReturn();
        method.b();
    }
}
