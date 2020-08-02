package com.example.studentservice.service;

import com.example.studentservice.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> getAllStudents();

    void createStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(Integer id);

    Optional<Student> getStudent(Integer id);
}
