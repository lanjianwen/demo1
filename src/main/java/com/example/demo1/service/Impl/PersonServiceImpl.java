package com.example.demo1.service.Impl;

import com.example.demo1.dao.mapper.PersonMapper;
import com.example.demo1.domain.Person;
import com.example.demo1.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public List<Person> findAll() {
        List<Person> list = personMapper.findAll();
        return list;
    }
}
