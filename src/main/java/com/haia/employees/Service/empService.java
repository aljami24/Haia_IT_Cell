package com.haia.employees.Service;

import com.haia.employees.Repository.empRepo;
import com.haia.employees.entity.empEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class empService {
    @Autowired
    private empRepo empRepo;

    public empEntity createEmp(empEntity empEntity) {
        return empRepo.save(empEntity);
    }
}
