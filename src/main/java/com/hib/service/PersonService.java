package com.hib.service;

import com.hib.entity.Person;
import org.springframework.stereotype.Service;

/**
 * @author Mehraj Malik
 * @version 1.0
 */
@Service
public interface PersonService {
    Person findById(Integer personId);
    Person findByName(String personName);
}
