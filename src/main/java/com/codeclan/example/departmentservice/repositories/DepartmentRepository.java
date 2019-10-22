package com.codeclan.example.departmentservice.repositories;

import com.codeclan.example.departmentservice.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
