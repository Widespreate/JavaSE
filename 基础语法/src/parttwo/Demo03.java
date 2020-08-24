package parttwo;

public class Demo03 {
    public static void main(String[] args) {
        //>=90 优秀 》=80 良好 >=60 及格 ，否则不及格
//        int ran = (int)(Math.random()*90+10) ;
//        System.out.println(ran);
//        if(ran>90){
//            System.out.println("优秀");
//        }else if(ran>80){
//            System.out.println("良好");
//        } else if (ran>60){
//            System.out.println("及格");
//        }else{
//            System.out.println("不及格");
//        }

        //测试人员 对项目进行测试，bug<3 A ;bug<5 B ;bug,10 C;bug>=10 D;
//        int bug = 12 ;
//       if(bug<3){
//           System.out.println("A");
//       }else if(bug<5){
//           System.out.println("B");
//       }else if(bug<10){
//           System.out.println("C");
//       }else {
//           System.out.println("D");
//       }
        //10秒以内进入决赛， 南，男子组决赛  女，女子组决赛
        double sec = 9.8 ;
        char sex = '男' ;
        if(sec<10){
            if(sex=='男'){
                System.out.println("恭喜你进入男子组决赛");
            }else if (sex=='女'){
                System.out.println("进入女子组决赛");
            }
        }else{
            System.out.println("出局");

        }
    }

}
