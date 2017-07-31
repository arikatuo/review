package com.hy.model;

/**
 * Created by dell on 2017/7/31.
 */
public class TeachFile {
    private Teacher teacher;
    private Students students;

    public TeachFile() {
    }

    public TeachFile(Teacher teacher, Students students) {
        this.teacher = teacher;
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public void print() {
        System.out.println("------教师信息------");
        System.out.println("姓名：" + teacher.getName());
        System.out.println("年龄：" + teacher.getAge());
        System.out.println("性别：" + teacher.getSex());
        System.out.println();
        System.out.println("------学生信息------");
        System.out.println("学号：" + students.getID());
        System.out.println("姓名：" + students.getName());
        System.out.println("年龄：" + students.getAge());
        System.out.println("性别：" + students.getSex());
    }
}
