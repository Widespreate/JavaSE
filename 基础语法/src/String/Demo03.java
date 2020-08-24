package String;

import java.util.StringTokenizer;

public class Demo03 {
    public static void test() {
        String str = "hello|world";
        String[] split = str.split("\\|");
        for (String a : split) {
            System.out.println(a);
        }
    }



    public static void test2() {
        String str = "hello|world";
        StringTokenizer token = new StringTokenizer(str, "|");
        while (token.hasMoreElements()) {
            System.out.println(token.nextElement());
        }
    }




    //输入一个字符串，统计该字符串中某个单字符串出现的次数
    public static int test03(String input, String word) {
        //先创建个数组，这个数组的长度就是传进来的单词长度!!
        // helloword ->{"h","e","l","l","o};
        int wordnum = 0;
        String[] strs = new String[input.length()];
        for (int i = 0; i < input.length(); i++) {
            strs[i] = input.substring(i, i + 1);
            if (strs[i].equals(word)) {
                wordnum++;
            }
        }
        return wordnum;
    }


    //判断一个字符串中，某个字符串出现的次数
    public  static int test04(String input, String word){

        int count = 0 ;
        //判断字符串中是否存在word,不存在分会-1，存在循环继续，
        while (input.indexOf(word)!= -1){
            count++;
            //这部操作是把已经确认存在的word去掉，从下一个角标开始截取晨光新的字符串进行对比
            input = input.substring(input.indexOf(word)+1);
        }
  return count ;
    }



    public static void main(String[] args) {
//        test();
//        test2();
//        System.out.println(test03("helloworld", "o"));
        System.out.println(test04("helloworllod","llo"));
    }
}
