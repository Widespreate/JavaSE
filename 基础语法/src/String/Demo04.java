package String;

public class Demo04 {


    public static void test01() {
        //indexof("字符串")：字符串再源字符串中的 位置
        //位置-->找字符
        String str = "helloword";
        System.out.println(str.charAt(2));
        //replace
        str = str.replace("h", "y");
        System.out.println(str);
    }

    public static void test02() {
        StringBuffer sb = new StringBuffer("abc");
        sb.append("aaa");//追加
        sb.insert(2, "ww");//插入
        sb.reverse();//逆序
        System.out.println(sb);
    }

    public static void test03() {
        String str = "asd";
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb);

        String b = sb.toString();
        System.out.println(b);
    }


    //一个数124124121倒叙输出并每隔3哥数字加上一个，号
    public static void test04(String digital) {
        StringBuffer sb = new StringBuffer(digital);
        for (int i = digital.length() - 3; i > 0; i = i-3) {
            sb.insert(i,",");
        }
        System.out.println(sb);

    }

    public static void main(String[] args) {
        //    test01();
        //      test02() ;
        test04("124124121");
    }

}

