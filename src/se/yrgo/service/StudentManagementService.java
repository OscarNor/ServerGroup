package se.yrgo.service;

import java.util.List;

import javax.ejb.Local;

import se.yrgo.domain.Student;

@Local
public interface StudentManagementService {
	public void registerEmployee(Student student);
	public List<Student>getAllEmployees ();
	public List<Student>searchBysurname(String student);
}
