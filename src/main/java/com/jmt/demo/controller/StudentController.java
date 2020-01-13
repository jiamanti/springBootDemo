package com.jmt.demo.controller;

import com.jmt.demo.entity.Student;
import com.jmt.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/findAll")
    public List<Student> findAll() {
        return studentService.findAll();



    }

}
