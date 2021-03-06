package se.yrgo.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student implements Serializable {

	private static final long serialVersionUID = -1398578751550404682L; 
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String firstName;
	private String lastName;
	private String admissionYear;
	private String school;
	
	public Student() {
		
	}
	
	public Student(String firstName, String lastName, String admissionYear, String school) {
		//super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.admissionYear = admissionYear;
		this.school = school;
	}
	
	// Getters
	public static long getSUID(){
		return serialVersionUID;
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
	
	
	// Setters
	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAdmissionYear(String admissionYear) {
		this.admissionYear = admissionYear;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	
	@Override
	public String toString() {
		return "Student: id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", admissionYear="
				+ admissionYear + ", school=" + school;
	}
	
	
	
}