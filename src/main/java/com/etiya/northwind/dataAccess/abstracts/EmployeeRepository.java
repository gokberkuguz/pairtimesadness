package com.etiya.northwind.dataAccess.abstracts;

import com.etiya.northwind.entities.concretes.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
