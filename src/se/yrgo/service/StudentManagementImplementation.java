package se.yrgo.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import se.yrgo.domain.Employee;
import se.yrgo.domain.Student;

@Stateless
public class StudentManagementImplementation implements StudentManagementService {
	
	@Inject
	private StudentDataAccess dao;
	
	
	public void insertStudent(Student student) {
		dao.insertStudent(newStudent);
	}

	@Override
	public List<Student> findAllStudents() {
		return dao.findBySurname(lastname);;
	}

	@Override
	public List<Student> findStudentByLastName(String student) {
		return findAll();
	}
	
	@Override
	public Student findStudentById(int id) {
		return dao.findStudentById(id);
	}


}