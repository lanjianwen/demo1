package com.example.demo1.controller;

import com.example.demo1.domain.Person;

public class PersonController {


    public Person person(){

        Person person = new Person();
        person.setId(1);
        person.setName("aa");
        return person;
    }
}
