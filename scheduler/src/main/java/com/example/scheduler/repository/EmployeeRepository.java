package com.example.scheduler.repository;

import com.example.scheduler.entity.Department;
import com.example.scheduler.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
