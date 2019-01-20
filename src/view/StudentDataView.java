/*
 * StudentDataView.java
 *
 * The StudentDataView.java Class for the Learning project
 * Created in the view package.
 * 
 * Created on Jan 19, 2019 at 1:49:42 PM
 * Created by artieman1
 *
 *
 * Purpose: <What is the purpose of the file?>
 */

package view;
import java.util.Scanner;
import controller.*;
import model.*;

/**
 * @author artieman1
 *
 */
public class StudentDataView {
	private Scanner keyboard = new Scanner(System.in);
	private JsonControl control = new JsonControl();
	private Student student;
	
	public StudentDataView() {}
	
	public void addModel(Student _student) {
		student = _student;
	}
	
	public void addController(JsonControl _control) {
		control = _control;
	}
	
	public void collectStudentInfo() {
		System.out.println("Please enter your name");
		control.setName(keyboard.nextLine());
		System.out.println("Please enter your favorite school");
		control.setFavSchool(keyboard.nextLine());
		System.out.println("Please enter your pet's name");
		control.setPetName(keyboard.nextLine());
		System.out.println("Please enter your age");
		control.setAge(keyboard.nextInt());
		
	}

	public void printStudentInfoJson (String _jsonData) {
		// This could have been passed as a Student obAhhj and just printed but this
		// helps to demonstrate the difference between the printing of the key:value pair
		// and the JSON parser in action.
		
		System.out.println("Here is the Student object in JSON format\n" + _jsonData + "\n");
	}
	
	public void printStudentInfoKeyValue (String _parsedJsonString) {
		// Here we will take JSON data and parse it back to key:value pairs
		System.out.println("Here is the parsed out key value fromt he JSON string");
		System.out.println(_parsedJsonString);
	}

}
