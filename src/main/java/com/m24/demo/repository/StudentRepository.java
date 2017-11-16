package com.m24.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.m24.demo.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
   Student findByStudentId(long studentId);
}
