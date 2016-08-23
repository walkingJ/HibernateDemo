package entity;

import java.io.Serializable;
import entity.Teacher;
import entity.Student;
import entity.School;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private int id;
	private String name;
	private int age;
	private String gender;
	private String className;
	private String headTeacher;
	private int teacherID;
	private int schoolID;
	
	/** persistent field */
	private Teacher teacher;
	private School school;
	
	/** full constructor */
	public Student(int id, String name, int age, String gender,
			String className, String headTeacher, int teacherID, int schoolID,
			Teacher teacher, School school) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.className = className;
		this.headTeacher = headTeacher;
		this.teacherID = teacherID;
		this.schoolID = schoolID;
		this.teacher = teacher;
		this.school = school;
	}
	
	public Student(){}
	
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
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getHeadTeacher() {
		return headTeacher;
	}
	public void setHeadTeacher(String headTeacher) {
		this.headTeacher = headTeacher;
	}
	public int getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
	}
	public int getSchoolID() {
		return schoolID;
	}
	public void setSchoolID(int schoolID) {
		this.schoolID = schoolID;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	
}
