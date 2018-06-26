package com.hib.repository;

import com.hib.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Mehraj Malik
 * @version 1.0
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
    Optional<Person> findByName(String name);
}
