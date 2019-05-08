package com.example.StudentCrudDemoApi.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.StudentCrudDemoApi.Model.Student;

@Component
public interface StudentService {
	public List<Student> findAll();

}
