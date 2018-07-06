package com.hib.service;

import com.hib.entity.Student;
import com.hib.util.StudentVM;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mehraj Malik
 * @version 1.0
 */
@Service
public interface StudentService {
    Student findById(Integer studentId);
    Student findByName(String studentName);
    Student save(StudentVM student);
    Integer deleteById(Integer studentId);
    List<Student> findAll();
}
