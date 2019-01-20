/*
 * Student.java
 *
 * The Student.java Class for the LessonsWk2 project
 * Created in the model package.
 * 
 * Created on Jan 19, 2019 at 12:24:39 AM
 * Created by artieman1
 *
 *
 * Purpose: <What is the purpose of the file?>
 */


package model;
import view.*;

import java.io.Serializable;

/**
 * @author artieman1
 *
 */
public class Student implements Serializable{

	private String name;
	private int age;
	private String favSchool;
	private String petName;
	private String studentDataJson;
	private StudentDataView view;
	
	public Student() {}
	
	public void addView(StudentDataView _view) {
		view = _view;
	}
	
	/**
	 * Purpose: Return the name of the Student
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Purpose: Set the name of the Student
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Purpose: Return the age of the Student
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * Purpose: Set the age of the Student
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * Purpose: Return the favorite school of the student
	 * @return the favSchool
	 */
	public String getFavSchool() {
		return favSchool;
	}
	/**
	 * Purpose: Set the favorite school of the student
	 * @param favSchool the favSchool to set
	 */
	public void setFavSchool(String favSchool) {
		this.favSchool = favSchool;
	}
	/**
	 * Purpose: Return the pet name of the student
	 * @return the petName
	 */
	public String getPetName() {
		return petName;
	}
	/**
	 * Purpose: Set the pet name of the student
	 * @param petName the petName to set
	 */
	public void setPetName(String petName) {
		this.petName = petName;
	}
	/**
	 * Purpose: Get the student data in JSON format
	 * @return the studentDataJson
	 */
	public String getStudentDataJson() {
		return studentDataJson;
	}
	/**
	 * Purpose: Set the student data in JSON format
	 * @param studentDataJson the studentDataJson to set
	 */
	public void setStudentDataJson(String studentDataJson) {
		this.studentDataJson = studentDataJson;
	}

	
}
