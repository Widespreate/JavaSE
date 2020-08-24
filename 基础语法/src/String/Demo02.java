package String;

public class Demo02 {
    //验证邮箱是否符合格式 合法 1355091138@qq.com
    public static boolean isValidateEmail(String email) {
        //合法情况
        //email必须有@和.并且@在.前面
        if (email.indexOf("@") != -1 && email.indexOf(".") != -1
                && email.indexOf("@") < email.indexOf(".")) {
            return true;
        }
        return false;
    }

    //校验电话是不是合法
    public static void testSubstring() {
        //判断是座机还是手机号
        //座机要求：区号是3或4位，右边8位
        String phone = "04522-556721281";
        if (phone.indexOf("-") != -1) {
            //substring(start,end),start能取到，end取不到。[)左闭右开
            //区号是三位或者四位
            //截取区号
            System.out.println("座机号码————");
            int start = 0;
            int end = phone.indexOf("-");
            String zone = phone.substring(start, end);
            if (zone.length() == 3 || zone.length() == 4) {
                System.out.println("区号正确");
            } else {
                System.out.println("区号有误");
            }
            //座机的右侧
            int startRight = end + 1;
            String numberStr = phone.substring(startRight);
            if (numberStr.length() == 8) {
                System.out.println("号码正确");
            } else {
                System.out.println("号码错误");
            }

        } else {
            System.out.println("手机号码");
        }
    }


    public static void testSubstring2(String phone) {
        //判断是座机还是手机号
        //座机要求：区号是3或4位，右边8位
//      String phone = "0452-55672128";
   //     String phone = "19920124443";

        if (phone.indexOf("-") != -1) {
            //substring(start,end),start能取到，end取不到。[)左闭右开
            //区号是三位或者四位
            //截取区号
            System.out.println("座机号码————");
            int start = 0;
            //-之前的数字
            int end = phone.indexOf("-");
            String zone = phone.substring(start, end);
            //-之后的数字
            int startRight = end + 1;
            String numberStr = phone.substring(startRight);
            if ((zone.length() == 3 || zone.length() == 4) && (numberStr.length() == 8)) {
                System.out.println("座机正确");
            } else {
                System.out.println("不正确");
            }
            //座机的右侧
        } else {
            //188888888888
            //以1开头11位数字
            String phonestart = phone.substring(0, 1);
            if (phonestart.equals("1") && phone.length() == 11) {
                System.out.println("手机号正确");
            } else {
                System.out.println("手机号码有误");
            }

        }
    }

    public static void testSplit(){
        String phone ="029-12345678";
        String[] ps  = phone.split("-");
        for(String p:ps){
            System.out.println(p);
        }


    }

    public static void main(String[] args) {
        //boolean result = isValidateEmail("1355091138@qq.com");
        // System.out.println(result == true ? "合法" : "不合法");
        //版本一
        // testSubstring();


//        Scanner input = new Scanner(System.in);
//        System.out.println("请输入电话号码");
//        String phone = input.next();
//        testSubstring2(phone);
//          testSplit();

        String str1 = "hello";
        String str2 = new String("hello");
        str2= str2.intern();
        System.out.println(str1==str2);//false
    }
}
