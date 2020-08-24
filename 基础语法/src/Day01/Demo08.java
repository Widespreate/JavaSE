package Day01;

public class Demo08 {
    //类变量，static
    static  double salary = 2500;
    //属性：变量
    //实例变量：从属于对象,不用初始化
    String name;
    char s;

    //main方法
    public static void main(String[] args) {
        //局部变量：必须声明和初始化值
        int i = 1;
        System.out.println(i);
        System.out.println(salary);
        //变量类型 变量名字 = new Demo08();
       Demo08 demo08 = new Demo08();
        System.out.println(demo08.name);
        System.out.println(demo08);
    }
    //其他方法
    public void add(){

    }
}
