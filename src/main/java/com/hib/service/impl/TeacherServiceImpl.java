package com.hib.service.impl;

import com.hib.entity.Student;
import com.hib.entity.Teacher;
import com.hib.repository.TeacherRepository;
import com.hib.service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mehraj Malik
 * @version 1.0
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    private TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Teacher findById(Integer teacherId) {
        return teacherRepository.findById(teacherId).orElse(null);
    }

    @Override
    public Teacher findByName(String teacherName) {
        return teacherRepository.findByName(teacherName).orElse(null);
    }

    @Override
    public List<Teacher> save(List<Teacher> teachers) {
        List<Teacher> teacherList = new ArrayList<>();
        for(Teacher teacher : teachers){
            Teacher teacherSaved =  teacherRepository.save(teacher);
            teacherList.add(teacherSaved);
        }
        return teacherList;
    }
}
