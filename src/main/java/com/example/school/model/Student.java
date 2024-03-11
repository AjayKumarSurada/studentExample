package com.example.school.model;

public class Student {
    int studentId;
    String studentName;
    String gender;
    int standard;

    public Student(
            int studentId, String studentName,
            String gender,
            int standard) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.gender = gender;
        this.standard = standard;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentGender() {
        return gender;
    }

    public void setStudentGender(String gender) {
        this.gender = gender;
    }

    public int getStudentStandard() {
        return standard;
    }

    public void setStudentStandard(int standard){
        this.standard = standard;
    }
}