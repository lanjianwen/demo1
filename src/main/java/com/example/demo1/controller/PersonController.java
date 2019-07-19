package com.example.demo1.controller;

import com.example.demo1.dao.mapper.PersonMapper;
import com.example.demo1.domain.Person;
import com.example.demo1.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/person")
    public List<Person> person(){

        return personService.findAll();
    }
}
