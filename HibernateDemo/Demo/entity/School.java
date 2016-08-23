package entity;

import java.io.Serializable;
import java.util.Set;

public class School implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3L;
	private int id;
	private String name;
	private String tel;
	private String city;
	private double outlay;
	private String type;
	
	/** persistent field */
	private Set students;
	private Set teachers;
	
	/** full constructor */
	public School(int id, String name, String tel, String city, double outlay,
			String type, Set students, Set teachers) {
		super();
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.city = city;
		this.outlay = outlay;
		this.type = type;
		this.students = students;
		this.teachers = teachers;
	}
	
	public School(){}
	
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getOutlay() {
		return outlay;
	}
	public void setOutlay(double outlay) {
		this.outlay = outlay;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Set getStudents() {
		return students;
	}
	public void setStudents(Set students) {
		this.students = students;
	}
	public Set getTeachers() {
		return teachers;
	}
	public void setTeachers(Set teachers) {
		this.teachers = teachers;
	}
	
}
