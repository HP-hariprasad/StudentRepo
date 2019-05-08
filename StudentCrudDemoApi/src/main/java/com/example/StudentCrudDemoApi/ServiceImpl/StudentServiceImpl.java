package com.example.StudentCrudDemoApi.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.StudentCrudDemoApi.DAO.StudentDAO;
import com.example.StudentCrudDemoApi.Model.Student;
import com.example.StudentCrudDemoApi.Service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	
	private StudentDAO studentDAO;
	
	@Autowired
	public StudentServiceImpl(StudentDAO theStudentDAO) {
		studentDAO = theStudentDAO;
	}

	@Override
	@Transactional
	public List<Student> findAll() {
		return studentDAO.findAll();
	}

}
