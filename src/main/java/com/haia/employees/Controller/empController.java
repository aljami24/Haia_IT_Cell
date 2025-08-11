package com.haia.employees.Controller;


import com.haia.employees.Service.empService;
import com.haia.employees.entity.empEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class empController {

    @Autowired
    public empService empservice;

    @PostMapping
    public empEntity createmp (@RequestBody empEntity empentity){
        return empservice.createEmp(empentity);
    }


    @GetMapping
    public List<empEntity> getemp (){
        return empservice.getallEmp();
    }

    @GetMapping("{id}")
    public empEntity getById(@PathVariable int id){
        return empservice.getById(id);
    }

}
