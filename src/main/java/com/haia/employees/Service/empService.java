package com.haia.employees.Service;

import com.haia.employees.Repository.empRepo;
import com.haia.employees.entity.empEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class empService {
    @Autowired
    private empRepo empRepo;

    public empEntity createEmp(empEntity empEntity) {
        return empRepo.save(empEntity);
    }

    public List<empEntity> getallEmp() {
        return empRepo.findAll();
    }

    public empEntity getById(Integer id) {
        return empRepo.findById(id).orElseThrow();
    }

    public void deleteEmp(Integer id) {
        empRepo.deleteById(id);
    }

    public empEntity updatedEmp(Integer id, empEntity updated) {
        empEntity save = empRepo.findById(id).orElseThrow();
        save.setName(updated.getName());
        save.setAddress(updated.getAddress());
        save.setPhone(updated.getAddress());
        return save;
    }
}
