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
import java.util.ArrayList;

import model.*;
import view.*;
import qcJSON.*;
import java.io.Serializable;

/**
 * Purpose: this is to manage the application view and models.
 * 				We call the views and get/set values in the model from here.
 * 				The Controller know about both the view (StudentDataView) classes
 * 				and the model (Student) classes and can control both.
 * 
 * @author artieman1
 *
 */
public class JsonControl implements Serializable {
	private Student student;
	private StudentDataView view;
	
	/**
	 * Purpose: This is the constructor for the controller. We create an instance from the
	 * 				main() method in Learning.java
	 * 
	 * @param Student is the model for the applicaiton. It is stored as student here
	 * @param StudentDataView is the view for the application. It is stored as
	 * 			view here
	 * 
	 */
	public JsonControl(Student _model, StudentDataView _view) {
		this.student = _model;
		this.view = _view;
	}
		
	/**
	 * Purpose: we get the user to input some values in the view
	 */
	public void getUserInput() {
		view.collectStudentInfo();
	}
	
	/**
	 * Purpose: we display the user input'd data to the view.
	 */
	public void showStudentData() {
		try {
			// First we will display the stringified JSON data
			view.printStudentInfoJson(student.getStudentDataJson());
			// Next we will display the Parsed JSON into a Key-Value Data
			view.printStudentInfoKeyValue(student.getParsedStudentDataJson(student.getStudentDataJson()));
		} catch (JSONException e) {
			System.out.println("There was an error. Please try again..."); 
		}
	}

	
	/**
	 * Purpose: this is where we set the values of the user input'd fields into the model
	 * 				We do this here, instead of in the view, to conform to the MVC model
	 */
	public void storeUserInput() {
		student.setName(view.getName());
		student.setAge(view.getAge());
		student.setFavSchool(view.getFavSchool());
		student.setPetName(view.getPetName());
		try {
			student.setStudentDataJson(student);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}