package com.jmt.demo.service.Impl;


import com.jmt.demo.entity.Student;
import com.jmt.demo.mapper.StudentMapper;
import com.jmt.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }
}
