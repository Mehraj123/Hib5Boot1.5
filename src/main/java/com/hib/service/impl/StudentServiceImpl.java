package com.hib.service.impl;

import com.hib.entity.Student;
import com.hib.entity.Teacher;
import com.hib.repository.StudentRepository;
import com.hib.service.StudentService;
import com.hib.service.TeacherService;
import com.hib.util.StudentVM;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Mehraj Malik
 * @version 1.0
 */
@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;
    private TeacherService teacherService;

    public StudentServiceImpl(StudentRepository personRepository,TeacherService teacherService){
        this.studentRepository = personRepository;
        this.teacherService = teacherService;
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
        studentRequest.setLaptop(student.getLaptop());
        Set<Teacher> teacherSet = new HashSet<>();
        Set<Integer> teacherIds = student.getTeacherIds();
        for(Integer id : teacherIds){
           Teacher teacher =  teacherService.findById(id);
           if(teacher!=null){
               teacherSet.add(teacher);
           }
        }
        studentRequest.setTeacherSet(teacherSet);
        return studentRepository.save(studentRequest);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Integer deleteById(Integer studentId){
        try {
            studentRepository.deleteById(studentId);
            return studentId;
        } catch (Exception e){
            throw e;
        }
    }
}
