package com.hib.util;

import com.hib.entity.Laptop;

import java.util.Set;

/**
 * @author Mehraj Malik
 * @version 1.0
 */
public class StudentVM {
    private Integer id;
    private String name;
    private Laptop laptop;
    private Set<Integer> teacherIds;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Set<Integer> getTeacherIds() {
        return teacherIds;
    }

    public void setTeacherIds(Set<Integer> teacherIds) {
        this.teacherIds = teacherIds;
    }

    @Override
    public String toString() {
        return "StudentVM{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", laptop=" + laptop +
                ", teacherIds=" + teacherIds +
                '}';
    }
}
