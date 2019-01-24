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

import qcJSON.JSONException;
import qcJSON.JSONUtilities;
import qcJSON.ParseException;

/**
 * Purpose: This is the model classes of the MVC. It is here to construct
 * 				the storage of the data into the model object.
 * 
 * @author artieman1
 *
 */
public class Student implements Serializable{

	private String name, favSchool, petName, studentDataJson;
	private int age;
			
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
		return this.studentDataJson;
	}
	
	
	/**
	 * Question: should this be in the model and simply a setter here or is it okay to
	 * 				manipulate the data in the model like this?
	 * 
	 * @param Student the value of the student object in this model
	 * @throws JSONException in the event there is a problem with stringify process
	 * 
	 */
	public void setStudentDataJson(Student _student) throws JSONException {
		try {
				this.studentDataJson = JSONUtilities.stringify(_student); 
			}
		catch (JSONException e) {
			System.out.println("There was a failure when trying to stringify the object..");
		}
	}
	
	
	/*
	 * Question: Because this is not storing data, should I do this here or in the controller?
	 * 
	 * Purpose: to parse data from JSON back to a key/value pair
	 * @param String for the stored JSON value in the model
	 */
	public String getParsedStudentDataJson(String _studentJsonData) throws JSONException {
		try {
			return JSONUtilities.parse(_studentJsonData).toString();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			return "false";
		}
	}


	
	
}
