package parttwo;

public class Demo01 {
    public static void main(String[] args) {
        //xm 98 如果 zs 考试成绩比小明高，则奖励一个mp3
//        int xm = 98 ;
//        int zs = 97 ;
        //if语句
//        if(zs>xm){   //java语言的 if ,表达式必须是boolean类型
//            System.out.println("奖励mp3");
//        }


        //if...else..语句
//        if(zs>xm){
//            System.out.println("奖励mp3");
//        }else{
//            System.out.println("抄10遍名字");
//        }

        //如果zs的java成绩>90 且 英语成绩>95 则奖励，
        //或者zs的java成绩》95 且 英语成绩>80 也奖励
//        int java = 89 ;
//        int english = 96 ;
//
//        if(java>90 && english>95||java>95 && english>90) {
//            System.out.println("奖励");
//         }

        int a = 100 ;
        int b = 20 ;
        String  str = a>b?"对":"错";
        System.out.println(str);
    }
}
