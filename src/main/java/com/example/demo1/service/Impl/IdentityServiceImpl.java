package com.example.demo1.service.Impl;

import com.example.demo1.dao.mapper.IdentityMapper;
import com.example.demo1.domain.Identity;
import com.example.demo1.service.IdentityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdentityServiceImpl implements IdentityService {

    @Autowired
    private IdentityMapper identityMapper;

    @Override
    public List<Identity> findById(int id){
        return identityMapper.findById(id);
    }
}
