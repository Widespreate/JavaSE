package method;

public class TestStudent {
    //比较方法
    public static void compareStudent(Student[] students) {
        //冒泡排序
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                //注意对比的是student的分数总和不是student
                if (students[j].getSum() < students[j + 1].getSum()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.name = "zs";
        stu1.javaScore = 99;
        stu1.sqlScore = 98;
        Student stu2 = new Student();
        stu2.name = "ls";
        stu2.javaScore = 89;
        stu2.sqlScore = 90;
        Student stu3 = new Student();
        stu3.name = "ww";
        stu3.javaScore = 88;
        stu3.sqlScore = 95;
        double stu1Avg = stu1.getAvg();
        double stu2Avg = stu2.getAvg();
        double stu3Avg = stu3.getAvg();
        int stu1Sum = stu1.getSum();
        int stu2Sum = stu2.getSum();
        int stu3Sum = stu3.getSum();
        System.out.println(stu1.name + "\t" + stu1Avg + "\t" + stu1Sum);
        System.out.println(stu2.name + "\t" + stu2Avg + "\t" + stu2Sum);
        System.out.println(stu3.name + "\t" + stu3Avg + "\t" + stu3Sum);
        //对象数组
        Student[] students = new Student[]{stu1, stu2, stu3};
        compareStudent(students);
        for (int i = 0; i < students.length; i++) {
            System.out.println("第" + (i + 1) + "名是" + students[i].name + students[i].getSum());
        }
    }
}

