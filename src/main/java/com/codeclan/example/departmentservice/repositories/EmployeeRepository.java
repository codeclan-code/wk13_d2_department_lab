package com.codeclan.example.departmentservice.repositories;

import com.codeclan.example.departmentservice.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
