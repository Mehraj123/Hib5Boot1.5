package com.hib.controller;

import com.hib.entity.Student;
import com.hib.service.StudentService;
import com.hib.util.StudentVM;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Mehraj Malik
 * @version 1.0
 */
@RestController
@RequestMapping("/apis/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAll() {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Student findById(@PathVariable Integer id) {
        return studentService.findById(id);
    }

    @PostMapping
    public Student save(@RequestBody StudentVM student) {
        return studentService.save(student);
    }

    @DeleteMapping("/{id}")
    public Integer deleteById(@PathVariable Integer id) {
        return studentService.deleteById(id);
    }

    @GetMapping("/names")
    public List<String> findAllNames() {
        return studentService.getAllNames();
    }

    @GetMapping("/names/{name}")
    public Student findByNameLike(@PathVariable String name) {
        return studentService.findByName(name);
    }

}
