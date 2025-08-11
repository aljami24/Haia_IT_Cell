package com.haia.employees.Repository;

import com.haia.employees.entity.empEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface empRepo extends JpaRepository<empEntity,Integer> {
}
