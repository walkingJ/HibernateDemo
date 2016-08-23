package entity;

import java.io.Serializable;
import java.util.Set;
import entity.Teacher;
import entity.School;

public class Teacher implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private int age;
	private String gender;
	private double salary;
	private String subject;
	private int schoolID;
	
	/** persistent field */
	private School school;
	private Set students;
	
	/** full constructor */
	public Teacher(int id, String name, int age, String gender,
			double salary, String subject, int schoolID, School school, Set students) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.subject = subject;
		this.schoolID = schoolID;
		this.school = school;
		this.students = students;
	}

	public Teacher(){}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getSchoolID() {
		return schoolID;
	}
	public void setSchoolID(int schoolID) {
		this.schoolID = schoolID;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}

	public Set getStudents() {
		return students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}
	
}
