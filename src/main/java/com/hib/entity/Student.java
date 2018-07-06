package com.hib.entity;

import javax.persistence.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name="STUDENT")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ROLL_NO")
	private Integer rollNo;
	@Column(name = "NAME")
	private String name;
    /**
     * One Student will have only one laptop
     */
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "LAPTOP_ID_FK")
	private Laptop laptop;

	private LocalDate localDate;

	private LocalDateTime localDateTime;

	private Duration duration;

    /**
     * Many Student can be interacting more teachers
     */
    @ManyToMany
    @JoinTable(name = "JOIN_STUDENT_TEACHER",
            joinColumns = {@JoinColumn(name = "rollNo")},
            inverseJoinColumns = {@JoinColumn(name = "id")}
            )
	private Set<Teacher> teacherSet;

	public Student() {
	}
	
	public Student(String name) {
		this.name = name;
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

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public Set<Teacher> getTeacherSet() {
        return teacherSet;
    }

    public void setTeacherSet(Set<Teacher> teacherSet) {
        this.teacherSet = teacherSet;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }
}
