package com.hib.controller;

import com.hib.entity.Person;
import com.hib.service.PersonService;
import org.springframework.web.bind.annotation.*;

/**
 * @author Mehraj Malik
 * @version 1.0
 */
@RestController
@RequestMapping("/apis/persons")
public class PersonController {

    private PersonService personService;

    public  PersonController(PersonService personService){
        this.personService = personService;
    }

 @GetMapping("/{id}")
 public Person findById(@PathVariable Integer id){
        return personService.findById(id);
 }

}
