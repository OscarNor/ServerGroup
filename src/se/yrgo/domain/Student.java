package se.yrgo.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Student implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int id;

	private String firstName;
	private String lastName;
	private String admissionYear;
	private String school;
	
	public Student() {
		
	}
	
	public Student(String firstName, String lastName, String admissionYear, String school ) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.admissionYear = admissionYear;
		this.school = school;
	}
	
	public int getId() {
		return id;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	
	
	public String getAdmissionYear() {
		return admissionYear;
	}
	
	
	public String getSchool() {
		return school;
	}

	@Override
	public String toString() {
		return "Student: id =" + id + ", firstName =" + firstName + ", lastName =" + lastName + ", admissionYear="
				+ admissionYear + ", school =" + "school";
	}
	
	
	
}