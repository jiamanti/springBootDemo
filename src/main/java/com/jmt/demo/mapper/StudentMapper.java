package com.jmt.demo.mapper;

import com.jmt.demo.entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentMapper {
    //@Select("select * from student")
    List<Student> findAll();
}
