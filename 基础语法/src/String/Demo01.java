package String;

public class Demo01 {
   static String s3 ;
    public static void main(String[] args) {
        //定义字符串方式一
        String a = "aaa" ;
        System.out.println(a);
        //定义字符串方式二
        String s1 = new String("hello World") ;
        System.out.println(s1);
        //定义字符串方式三
        String s2 = new String() ;
        System.out.println(s2.equals(""));//true
        //测试方式一的默认值
        System.out.println(s3);//null


        //常见的String 方法
        String str = "helloworld   " ;
        //1.判断相等.点进去发现是boolean类型
        boolean flag = str.equals("helloworld");
        System.out.println(flag);
        //2.忽略大小写
        boolean flag2 =str.equalsIgnoreCase("helloWorld") ;
        System.out.println(flag2);
        //3.返回长度
        int len = str.length();
        System.out.println(len);
        //4.小写转大写
        str = str.toUpperCase();
        System.out.println(str);
        //5.大写转小写
        str = str.toLowerCase() ;
        System.out.println(str);
        //6.查看字符串中”owo“的位置
       int position =  str.lastIndexOf("oso") ;
        System.out.println(position);
        //7.统计字符串长度（去空格）
        System.out.println("去空格之前的长度"+str.length());
        str = str.trim();
        System.out.println("去首位空格的长度"+str.length());
    }

}
