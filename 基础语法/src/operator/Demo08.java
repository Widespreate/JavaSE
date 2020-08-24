package operator;

public class Demo08 {
    public static void main(String[] args) {
        // x?y:z
        //如果x==true ,则结果为y，否则为z.yz为输出语句""
        //有接收的
        //必须掌握
        int score = 80 ;
       String type = score<60?"不及格":"及格";
        System.out.println(type);
    }
}
