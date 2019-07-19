package com.example.demo1.dao.mapper;

import com.example.demo1.domain.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PersonMapper {

    @Select("SELECT * FROM person")
    List<Person> findAll();
}
