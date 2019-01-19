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
import controller.*;
import java.util.Scanner;

/**
 * @author artieman1
 *
 */
public class StudentDataView {
	private Scanner keyboard = new Scanner(System.in);
	private String name;
	private int age;
	private String favoriteSchoolName;
	private String petsName;
	
	
	public StudentDataView() {}
	
	public void collectStudentInfo() {
		System.out.println("Please enter your name");
		name = keyboard.nextLine();
		
	}

	public void printStudentInfoJson (String _jsonData) {
		// This could have been passed as a Student obj and just printed but this
		// helps to demonstrate the difference between the printing of the key:value pair
		// and the JSON parser in action.
		System.out.println(_jsonData);
	}
	
	public void printStudentInfoKeyValue (String _name, String _age) {
		// Here we will take JSON data and parse it back to key:value pairs
		System.out.println(_name);
		System.out.println(_age);
	}

}
