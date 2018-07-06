package com.hib.service;

import com.hib.entity.Student;
import com.hib.entity.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mehraj Malik
 * @version 1.0
 */
@Service
public interface TeacherService {

    Teacher findById(Integer studentId);
    Teacher findByName(String studentName);
    List<Teacher> save(List<Teacher> teachers);
}
