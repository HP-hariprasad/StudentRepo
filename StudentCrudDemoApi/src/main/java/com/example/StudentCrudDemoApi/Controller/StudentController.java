package com.example.StudentCrudDemoApi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentCrudDemoApi.DAO.StudentDAO;
import com.example.StudentCrudDemoApi.Model.Student;
import com.example.StudentCrudDemoApi.Service.StudentService;


@RestController
@RequestMapping("/api")
public class StudentController {
	
	private StudentService studentService;
	
	
	@Autowired
	public StudentController(StudentService theStudentService){
		studentService = theStudentService;
	}

	@GetMapping("/students")
	public List<Student> findAll(){
		return studentService.findAll();
	}
}
