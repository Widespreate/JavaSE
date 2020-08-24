package method;

import java.util.Scanner;

public class MethodTest {
    //3个学生，平均分和最高分不能定义全局变量

    public void myInput(int[] students) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个学生成绩");
        students[0] = input.nextInt();
        System.out.println("请输入第二个学生成绩");
        students[1] = input.nextInt();
        System.out.println("请输入第三个学生成绩");
        students[2] = input.nextInt();
    }

    public double calcAvg(int[] students) {
        int sum = clacSum(students);
        double avg = sum * 1.0 / students.length;
        return avg;
    }

    public int clacSum(int[] students) {
        int sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i];
        }
        return sum;
    }

    public int calcMax(int[] students) {
        int max = 0;
        for (int i = 0; i < students.length; i++) {
            if (max < students[i]) {
                max = students[i];

            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] students = new int[3];
        MethodTest test = new MethodTest();
        test.myInput(students);
        int sum = test.clacSum(students);
        System.out.println("三人分数之和是" + sum);
        double avg = test.calcAvg(students);
        System.out.println("三人平均分是" + avg);
        int max = test.calcMax(students);
        System.out.println("三人最大分是" + max);


    }
}
