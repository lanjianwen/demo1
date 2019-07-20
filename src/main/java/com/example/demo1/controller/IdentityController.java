package com.example.demo1.controller;

import com.example.demo1.domain.Identity;
import com.example.demo1.service.IdentityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IdentityController {

    @Autowired
    private IdentityService identityService;

    @GetMapping("/identity/{id}")
    public List<Identity> identity(@PathVariable("id") int id){
        return identityService.findById(id);
    }

}
