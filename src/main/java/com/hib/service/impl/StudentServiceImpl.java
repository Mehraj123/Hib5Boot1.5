package com.hib.service.impl;

import com.hib.entity.Student;
import com.hib.repository.StudentRepository;
import com.hib.service.StudentService;
import com.hib.util.StudentVM;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Mehraj Malik
 * @version 1.0
 */
@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository personRepository) {
        this.studentRepository = personRepository;
    }

    @Override
    public Student findById(Integer studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }

    @Override
    public Student findByName(String studentName) {
        return studentRepository.findByNameIgnoreCaseContaining(studentName).orElse(null);
    }

    @Override
    public Student save(StudentVM student) {

        Student studentRequest = new Student();
        studentRequest.setName(student.getName());
        studentRequest.setJoiningDate(LocalDateTime.now());
        studentRequest.setDept("CSE");
        return studentRepository.save(studentRequest);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Integer deleteById(Integer studentId) {
        try {
            studentRepository.deleteById(studentId);
            return studentId;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<String> getAllNames() {
        return null;
    }
}
