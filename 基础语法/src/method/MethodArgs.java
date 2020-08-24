package method;

public class MethodArgs {
    public static void myMethod(String a, int b , double c){
        System.out.println(a+","+b+"c"+c);
    }

    public static void main(String[] args) {
        myMethod("helloWorld",10,12.3);
    }
}
