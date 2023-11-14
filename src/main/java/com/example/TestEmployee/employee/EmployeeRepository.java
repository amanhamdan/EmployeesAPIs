package com.example.TestEmployee.employee;

import com.example.TestEmployee.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
