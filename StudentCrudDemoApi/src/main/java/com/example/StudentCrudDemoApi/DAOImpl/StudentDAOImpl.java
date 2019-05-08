package com.example.StudentCrudDemoApi.DAOImpl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;


import com.example.StudentCrudDemoApi.DAO.StudentDAO;
import com.example.StudentCrudDemoApi.Model.Student;

public class StudentDAOImpl implements StudentDAO {

	private EntityManager entitymanager;

	@Autowired
	public StudentDAOImpl(EntityManager theEntityManager){
		entitymanager = theEntityManager;
	}

	@Override
	public List<Student> findAll() {
		Session currentSession = entitymanager.unwrap(Session.class);

		Query<Student> theQuery = currentSession.createQuery("from Student",Student.class);

		List<Student> students = theQuery.getResultList();

		return students;
	}

}
