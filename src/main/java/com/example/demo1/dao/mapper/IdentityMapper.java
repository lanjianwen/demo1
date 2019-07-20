package com.example.demo1.dao.mapper;

import com.example.demo1.domain.Identity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IdentityMapper {

        public List<Identity> findById(int id);
}
