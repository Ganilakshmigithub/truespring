package com.spring.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.models.employee;

public interface emprepo extends JpaRepository<employee,Integer>{

}
