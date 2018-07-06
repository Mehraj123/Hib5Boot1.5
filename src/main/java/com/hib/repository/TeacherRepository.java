package com.hib.repository;

import com.hib.entity.Teacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Mehraj Malik
 * @version 1.0
 */
@Repository
public interface TeacherRepository extends CrudRepository<Teacher, Integer> {
    Optional<Teacher> findById(Integer integer);
    Optional<Teacher> findByName(String name);
}
