package com.m24.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.m24.demo.entity.Student;
import com.m24.demo.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {
	@Autowired
	StudentService service;
	
	@RequestMapping("findByStudentId/{id}")
	public Student findByStudentId(@PathVariable long id) {
		return service.findByStudentId(id);
	}

	@RequestMapping("/findAll/{offset}/{limit}")
	public List<Student> findAll(@PathVariable int offset, @PathVariable int limit) {
		return service.findAll(offset, limit);
	}

	@RequestMapping("/save")
	public void save(Student student) {
		service.save(student);
	}
}
