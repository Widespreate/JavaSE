package method;

import java.util.Scanner;

public class OOPScore {
    int javaScore = 0 ;
    int cScore =0 ;
    int sqlScore=0;

    public void inputScore(){
        Scanner input = new Scanner(System.in) ;
        System.out.println("请输入java成绩");
        javaScore = input.nextInt() ;
        System.out.println("C");
        cScore = input.nextInt() ;
        System.out.println("SQL");
        sqlScore = input.nextInt() ;
    }

    //计算平局分并返回
    public double calcAvg(){
        double avg = (javaScore+cScore+sqlScore)/3.0;
        return avg ;
    }
    //计算总分并返回
    public int calcSum(){
        int sum = javaScore+cScore+sqlScore;
        return sum ;
    }

    public static void main(String[] args) {
        OOPScore oop = new OOPScore();
        oop.inputScore();
        double avg = oop.calcAvg() ;
        System.out.println(avg);
        int sum = oop.calcSum() ;
        System.out.println(sum);
    }

}
