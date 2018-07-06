package com.hib.entity;

import javax.persistence.*;
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

    /**
     * One Student can be interacting with one or more teachers
     */
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "student",fetch = FetchType.EAGER)
	private Set<Teacher> teachers;

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

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
    }


    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", laptop=" + laptop +
                ", teachers=" + teachers +
                '}';
    }
}
