package com.hib.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "STUDENT")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ROLL_NO")
    private Integer rollNo;
    @Column(name = "NAME")
    private String name;
    @Column(name = "DATE_OF_JOINING")
    private LocalDateTime joiningDate;
    @Column(name = "DEPARTMENT")
    private String dept;

    public Student() {
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public LocalDateTime getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDateTime joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
