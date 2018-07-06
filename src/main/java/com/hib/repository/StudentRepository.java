package com.hib.repository;

import com.hib.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Mehraj Malik
 * @version 1.0
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    Optional<Student> findByName(String name);
}
