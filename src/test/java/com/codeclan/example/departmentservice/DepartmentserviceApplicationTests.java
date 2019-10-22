package com.codeclan.example.departmentservice;

import com.codeclan.example.departmentservice.models.Department;
import com.codeclan.example.departmentservice.models.Employee;
import com.codeclan.example.departmentservice.models.Project;
import com.codeclan.example.departmentservice.repositories.DepartmentRepository;
import com.codeclan.example.departmentservice.repositories.EmployeeRepository;
import com.codeclan.example.departmentservice.repositories.ProjectRepository;
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

	@Autowired
	ProjectRepository projectRepository;

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

	@Test
	public void addEmployeeAndProjects(){
		Department department1 = new Department("Marketing");
		departmentRepository.save(department1);

		Employee employee1 = new Employee("Jimmy", "Smith", 123, department1);
		employeeRepository.save(employee1);

		Project project = new Project("Big Project", 5);
				projectRepository.save(project);

		project.addEmployee(employee1);
		projectRepository.save(project);


	}

}
