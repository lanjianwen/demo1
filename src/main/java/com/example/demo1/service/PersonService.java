package com.example.demo1.service;

import com.example.demo1.domain.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonService {

    List<Person> findAll();

}
