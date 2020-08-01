package com.example.studentservice.service;

import com.example.studentservice.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    void createStudent(Student student);
}
