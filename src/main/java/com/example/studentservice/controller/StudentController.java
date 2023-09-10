package com.example.studentservice.controller;

import com.example.studentservice.model.Student;
import com.example.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/all")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Optional<Student> getAllStudents(@PathVariable("id") Integer id){
        return studentService.getStudent(id);
    }

    @PostMapping("createStudent")
    public void createStudent(@RequestBody Student student) {
        studentService.createStudent(student);
    }

    @PutMapping("updateStudent")
    public void updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
    }

    @DeleteMapping("deleteStudent/{id}")
    public void createStudent(@PathVariable("id") Integer id) {
        studentService.deleteStudent(id);
    }

    @GetMapping("/message")
    public String message() {
        return "Welcome to Azure master!!!";
    }

}
