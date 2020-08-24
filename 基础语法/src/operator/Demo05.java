package operator;

public class Demo05 {
    public static void main(String[] args) {
        //与、或、非
        boolean a =true;
        boolean b =false;
        System.out.println("a && b:"+(a && b));//两个变量都为真，结果才位真
        System.out.println("a || b:"+(a || b));//两个变量有一个位真，结果位真
        System.out.println("!(a && b):"+!(a && b));//如果为是真，则为假，如果是假，则为真


        //短路运算
        //验证
        int c = 5;
        boolean d = (c<4)&&(++c<4);
        System.out.println(d);
        System.out.println(c);

    }
}
