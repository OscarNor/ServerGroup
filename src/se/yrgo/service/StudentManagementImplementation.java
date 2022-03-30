package se.yrgo.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import se.yrgo.dataaccess.StudentDataAccess;
import se.yrgo.domain.Student;

@Stateless
public class StudentManagementImplementation implements StudentManagementService {
	
	
	@Inject
	private StudentDataAccess dao;
	
	
	public void insertStudent(Student newStudent) {
		dao.insertStudent(newStudent);
	}

	@Override
	public List<Student> findAllStudents() {
		
		Student stu1 = new Student("Gabriella", "Q", "2021", "Yrgo");
		Student stu2 = new Student("Oscar", "N", "2021", "Yrgo");
		Student stu3 = new Student("Patrik", "H", "2021", "Yrgo");
		
		List<Student> students = new ArrayList<Student>();
		students.add(stu1);
		students.add(stu2);
		students.add(stu3);
		return students;
		
	}

	@Override
	public List<Student> findStudentByLastName(String lastName) {
		return dao.findStudentByLastName(lastName);
	}
	
	@Override
	public Student findStudentById(int id) {
		return dao.findStudentById(id);
	}


}