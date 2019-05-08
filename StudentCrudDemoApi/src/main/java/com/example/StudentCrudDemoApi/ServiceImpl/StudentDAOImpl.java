package com.example.StudentCrudDemoApi.ServiceImpl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.StudentCrudDemoApi.DAO.StudentDAO;
import com.example.StudentCrudDemoApi.Model.Student;

public class StudentDAOImpl implements StudentDAO {

	private EntityManager entitymanager;

	@Autowired
	public StudentDAOImpl(EntityManager theEntityManager){
		entitymanager = theEntityManager;
	}

	@Override
	@Transactional
	public List<Student> findAll() {
		Session currentSession = entitymanager.unwrap(Session.class);

		Query<Student> theQuery = currentSession.createQuery("from Student",Student.class);

		List<Student> students = theQuery.getResultList();

		return students;
	}

}
