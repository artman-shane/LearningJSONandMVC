/*
 * JsonControl.java
 *
 * The JsonControl.java Class for the Learning project
 * Created in the controller package.
 * 
 * Created on Jan 19, 2019 at 1:46:54 PM
 * Created by artieman1
 *
 *
 * Purpose: <What is the purpose of the file?>
 */

package controller;
import java.util.jar.Attributes.Name;

import model.*;
import view.*;
import qcJSON.*;
import java.io.Serializable;

/**
 * @author artieman1
 *
 */
public class JsonControl implements Serializable {
	private Student student;
	private StudentDataView view;
	
	public JsonControl() {}
	
	public JsonControl(Student _student, StudentDataView _view) {
		this.student = _student;
		this.view = _view;
	}
	public void setName(String _name) {
		student.setName(_name);
	}
	public String getName() {
		return student.getName();
	}
	public int getAge() {
		return student.getAge();
	}
	public void setAge(int _age) {
		student.setAge(_age);
	}
	public String getFavSchool() {
		return student.getFavSchool();
	}
	public void setFavSchool(String _favSchool) {
		student.setFavSchool(_favSchool);
	}
	public String getPetName() {
		return student.getPetName();
	}
	public void setPetName(String _petName) {
		student.setPetName(_petName);
	}
	public String getStudentDataJson() {
		return student.getStudentDataJson();
	}
	public void setStudentDataJson(String _studentDataJson) {
		student.setStudentDataJson(_studentDataJson);
	}
	
	public void getUserInput() {
		view.collectStudentInfo();
	}
	
	public void showStudentData() {
		// First we will display the JSON data
		try {
			String result = generateJSONData(student);
			student.setStudentDataJson(result);
			view.printStudentInfoJson(getStudentDataJson());
			// Next we will display the KeyValueData

			// view.printStudentInfoKeyValue();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			System.out.println("There was an error. Please try again..."); 
		}
	}

	public String generateJSONData(Student _student) throws JSONException {
		try {
			return JSONUtilities.stringify(student);
		}
		catch (JSONException e) {
			return "failure";
		}
	}

	
}
