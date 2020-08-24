package com.zhao.www;

public class Student {
    //    作业
//    录入50个学生信息（姓名 年龄 成绩）
//    自动打印出成绩前3 的学生信息（风云榜）
    private int id ;
    private String name;
    private int age;
    private int score;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0 && age<120) {
            this.age = age;
        }else{
            System.out.println("输入有误");
        }
    }

    public int getScore() {

        return score;
    }

    public void setScore(int score) {
        if(score<=100 && score>0){
            this.score = score;
        }else{
            System.out.println("输入有误");
        }

    }
}
