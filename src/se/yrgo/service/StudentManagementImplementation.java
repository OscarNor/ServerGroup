package se.yrgo.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import se.yrgo.domain.Student;

@Stateless
public class StudentManagementImplementation implements StudentManagementService {
	
	@Inject
	private StudentDataAccess dao;
	
	
	public void registerEmployee(Student student) {
		dao.insert(newStudent);
	}

	@Override
	public List<Student> getAllEmployees() {
		return dao.findBySurname(lastname);;
	}

	@Override
	public List<Student> searchBysurname(String student) {
		return findAll();
	}

}