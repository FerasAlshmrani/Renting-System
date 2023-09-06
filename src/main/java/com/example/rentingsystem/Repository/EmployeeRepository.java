package com.example.rentingsystem.Repository;

import com.example.rentingsystem.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    Employee findEmployeeById(Integer employeeId);
}