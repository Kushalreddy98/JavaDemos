package com.api.serial;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID=3L;
    private String studentName;
    private String studentDepartment;
    private int studentId;

    public Student() {
    }

    public Student(String studentName, String studentDepartment, int studentId) {
        this.studentName = studentName;
        this.studentDepartment = studentDepartment;
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentDepartment() {
        return studentDepartment;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentDepartment(String studentDepartment) {
        this.studentDepartment = studentDepartment;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentDepartment='" + studentDepartment + '\'' +
                ", studentId=" + studentId +
                '}';
    }
}
