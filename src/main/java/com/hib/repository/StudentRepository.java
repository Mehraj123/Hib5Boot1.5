package com.hib.repository;

import com.hib.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author Mehraj Malik
 * @version 1.0
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    String  ALL_NAMES = "SELECT name from Student";

    Optional<Student> findByNameIgnoreCaseContaining(String name);
    @Query(value = ALL_NAMES, nativeQuery = true)
    List<String> findAllNames();
}
