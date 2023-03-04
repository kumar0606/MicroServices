package com.ravi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravi.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}