package com.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.models.employee;
import com.spring.services.empservice;

@RestController

@RequestMapping("/employee")
public class empcontroller {

    @Autowired
    empservice es;


    @PostMapping
    public employee addEmployee(@RequestBody employee e){
        return es.addemp(e);
    }
    
}
