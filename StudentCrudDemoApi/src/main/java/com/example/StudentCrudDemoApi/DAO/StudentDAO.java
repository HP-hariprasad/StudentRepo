package com.example.StudentCrudDemoApi.DAO;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.StudentCrudDemoApi.Model.Student;

@Component
public interface StudentDAO {
	public List<Student> findAll();
}
