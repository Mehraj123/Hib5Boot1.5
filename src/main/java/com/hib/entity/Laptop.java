package com.hib.entity;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

/**
 * @author Mehraj Malik
 * @version 1.0
 */
@Entity
@Table(name = "LAPTOP")
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer laptopId;
    private String name;

    public Integer getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(Integer laptopId) {
        this.laptopId = laptopId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "laptopId=" + laptopId +
                ", name='" + name + '\'' +
                '}';
    }
}
