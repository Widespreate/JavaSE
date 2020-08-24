package com.zhao.www;

import java.util.Scanner;

public class StudentManger {
    private Student[] students;
    Scanner input = new Scanner(System.in);

    public void init() {
        students = new Student[20];
        //初始化学生3个
        Student student0 = new Student();
        student0.setId(001);
        student0.setName("赵鑫");
        student0.setAge(23);
        student0.setScore(99);

        Student student1 = new Student();
        student1.setId(002);
        student1.setName("李欣");
        student1.setAge(24);
        student1.setScore(89);

        Student student2 = new Student();
        student2.setId(003);
        student2.setName("周东");
        student2.setAge(22);
        student2.setScore(93);

        students[0] = student0;
        students[1] = student1;
        students[2] = student2;
    }

    public void menu() {
        //菜单信息
        System.out.println("欢迎进去学生成绩系统");
        System.out.println("请输入数字选择相应的功能");
        System.out.println("1：添加学生成绩信息");
        System.out.println("2：删除学生信息");
        System.out.println("3：显示全部学生信息");
        System.out.println("4：显示排行榜");

        System.out.println("是请输入你选择功能对应的数字");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                addStudent();
                break;
            case 2:
                deleteStudent();
                break;
            case 3:
                showStudent();
                break;
            case 4:
                studentRank();
                break;
            default:
                break;
        }
    }

    //添加学生
    private void addStudent() {

        System.out.println(" 添加学生");
        Student student = new Student();
        System.out.println("请输入学生ID");
        int studentId = input.nextInt();
        System.out.println("请输入学生姓名");
        String studentName = input.next();
        System.out.println("请输入学生年龄");
        int studentAge = input.nextInt();
        System.out.println("请输入学生分数");
        int studentScore = input.nextInt();

        student.setId(studentId);
        student.setName(studentName);
        student.setAge(studentAge);
        student.setScore(studentScore);
        int position = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                position = i;
                break;
            }
        }

        students[position] = student;

        isContinue();
    }

    //删除学生
    private void deleteStudent() {
        System.out.println(" 请输入删除学生姓名");
        String name = input.next() ;
        int position = - 1;
        for (int i = 0; i <students.length ; i++) {
                if ( students[i].getName().equals(name)) {
                    position = i  ;
                    break;
            }
        }
        int start = position+1;
        int firstNullPosition  = -1 ;
        for (int i = 0; i < students.length; i++) {
            if(students[i]==null){
                firstNullPosition = i;
                break;
            }
        }
        int end =firstNullPosition-1;
        //缺少了一个严谨性操作如果数组中元素没有null那么end的取值就应该是最后一位
        if(firstNullPosition == -1){
            end = students.length-1;
        }

        for (int i = start; i <end ; i++) {
            students[i-1] = students[i] ;
        }

        students[end] = null ;
        isContinue();
    }

    //显示全部学生
    private void showStudent() {

        System.out.println("显示全步学生");
        System.out.println("学生ID\t\t学生姓\t\t年龄\t\t分数");

//        for (Student student : students) {
//            if (student != null) {
//                System.out.println(student.getId() + "\t\t" + student.getName() + "\t\t" + student.getAge() + "\t\t" + student.getScore());
//            }
//        }


        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i].getId() + "\t\t\t" + students[i].getName() + "\t\t\t" + students[i].getAge() + "\t\t" + students[i].getScore());
            }
        }

        isContinue();
    }

    //学生成绩信息榜
    private void studentRank() {
    //创建学生信息榜主要的核心问题就是新建数组，不能使用原有数组排序，
        //创建一个数组，这个数组和原来的数组长度一样
        Student[] newStudent = new Student[students.length] ;
        for (int i = 0; i <newStudent.length ; i++) {
            if(students[i]!=null){
                newStudent[i] = students[i] ;
            }
        }

        for (int i = 0; i <newStudent.length-1 ; i++) {
            for (int j = 0; j <newStudent.length-1-i; j++) {
                if(newStudent[i]!= null && newStudent[i+1]!= null){
                    if(newStudent[i].getScore()<newStudent[i+1].getScore()){
                        Student temp = newStudent[i] ;
                        newStudent[i] =newStudent[i+1] ;
                        newStudent[i+1] =temp ;
                    }
                }
            }
        }
        System.out.println("//学生成绩信息榜");
        for (int i = 0; i < newStudent.length; i++) {
            if (newStudent[i] != null)
                System.out.println("第" + (i + 1) + "名是" + newStudent[i].getName());
        }
        isContinue();
    }

    //是否返回菜单
    private void isContinue() {

        System.out.println("请问是否返回菜单/推出系统");
        System.out.println("yes/其他");
        String choice = input.next();
        if (choice.equals("yes")) {
            menu();
        }
    }
}
