package com.example.school.repository;

import java.util.*;
import com.example.school.model.Student;

public interface StudentRepository {
    ArrayList<Student> getStudents();

    Student getStudentById(int studentId);

    Student updateStudent(int studentId, Student student);

    Student addStudent(Student student);

    String addBulkStudents(ArrayList<Student> students);

    void deleteStudent(int studentId);
}