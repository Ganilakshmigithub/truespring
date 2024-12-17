package com.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.models.employee;
import com.spring.repos.emprepo;

@Service
public class empservice {


    @Autowired
    emprepo er;

    public employee addemp(employee e){
        return er.save(e);
    }

    
}
