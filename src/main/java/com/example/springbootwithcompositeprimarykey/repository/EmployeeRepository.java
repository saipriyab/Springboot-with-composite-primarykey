package com.example.springbootwithcompositeprimarykey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootwithcompositeprimarykey.entity.Employee;
import com.example.springbootwithcompositeprimarykey.entity.EmployeePKId;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,EmployeePKId>{

}
