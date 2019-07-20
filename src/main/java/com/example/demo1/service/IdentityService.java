package com.example.demo1.service;

import com.example.demo1.domain.Identity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IdentityService {


    public List<Identity> findById(int id);

}
