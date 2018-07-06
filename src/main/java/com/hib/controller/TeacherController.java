package com.hib.controller;

import com.hib.entity.Teacher;
import com.hib.service.TeacherService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Mehraj Malik
 * @version 1.0
 */
@RestController
@RequestMapping("/apis/teachers")
public class TeacherController {

    private TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/{id}")
    public Teacher searchById(@PathVariable Integer id){
        return  teacherService.findById(id);
    }

    @PostMapping
    public List<Teacher> save(@RequestBody List<Teacher> teachers){
        return  teacherService.save(teachers);
    }

    @GetMapping("/names/{name}")
    public Teacher searchByName(@PathVariable String name){
        return  teacherService.findByName(name);
    }
}
