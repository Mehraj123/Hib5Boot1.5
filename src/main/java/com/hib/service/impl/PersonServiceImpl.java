package com.hib.service.impl;

import com.hib.entity.Person;
import com.hib.repository.PersonRepository;
import com.hib.service.PersonService;
import org.springframework.stereotype.Service;

/**
 * @author Mehraj Malik
 * @version 1.0
 */
@Service
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @Override
    public Person findById(Integer personId) {
        return personRepository.findById(personId).orElse(null);
    }

    @Override
    public Person findByName(String personName) {
        return personRepository.findByName(personName).orElse(null);
    }
}
