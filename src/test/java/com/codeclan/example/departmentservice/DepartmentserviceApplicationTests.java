package com.codeclan.example.departmentservice;

import com.codeclan.example.departmentservice.models.Department;
import com.codeclan.example.departmentservice.models.Employee;
import com.codeclan.example.departmentservice.repositories.DepartmentRepository;
import com.codeclan.example.departmentservice.repositories.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DepartmentserviceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployeeAndepartment(){
		Department department1 = new Department("Marketing");
		departmentRepository.save(department1);

		Employee employee1 = new Employee("Jimmy", "Smith", 123, department1);
		employeeRepository.save(employee1);
	}

}
