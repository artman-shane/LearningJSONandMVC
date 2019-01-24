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
 * Purpose: the view layer is where we present to the user input options and displayed data
 * 				This view does not know about the model or the controller classes.
 * @author artieman1
 *
 */
public class StudentDataView {
	private Scanner keyboard = new Scanner(System.in);
	private String name, petName, favSchool;

	private int age;

	public StudentDataView() {
		// This is where you would setup your display frame if we were using one
	}

	
	/**
	 * Purpose: we collect user input here and store it to local instance variables
	 */
	public void collectStudentInfo() {
		System.out.println("Please enter your name");
		name = keyboard.nextLine();
		System.out.println("Please enter your favorite school");
		favSchool = keyboard.nextLine();
		System.out.println("Please enter your pet's name");
		petName = keyboard.nextLine();
		System.out.println("Please enter your age");
		age = keyboard.nextInt();

	}

	
	/**
	 * Purpose: we will print the student information to the console.
	 * @param String - we are receiving the previously stringified JSON data here.
	 */
	public void printStudentInfoJson(String _jsonData) {
		// This could have been passed as a Student and just printed but this
		// helps to demonstrate the difference between the printing of the key:value
		// pair and the JSON parser in action.
		System.out.println("Here is the Student object in JSON format\n" + _jsonData + "\n");
	}

	
	/**
	 * Purpose: we received the parsed JSON data and print to the console.
	 * @param String - we are receiving the previously parsed JSON data here.
	 */
	public void printStudentInfoKeyValue(String _parsedJsonString) {
		// Here we will take JSON data and parse it back to key:value pairs
		System.out.println("Here is the parsed out key value fromt he JSON string");
		System.out.println(_parsedJsonString);
	}

	/**
	 * Purpose: When the user enters data into the prompts at the console, we must store it somewhere
	 * 				These getters are used to retrieve the data from the controller for storage into
	 * 				the model class.
	 * 
	 * QUESTION:I decided that since there is no clarification, that I can find, and after speaking
	 * 				to a professor at Gwinnett Georgia College that the example from a console does not
	 * 				conform well to MVC. As a result it was suggested that I perform the work in this manner
	 * 				Further, on the site: https://www.youtube.com/watch?time_continue=1&v=dTVVa2gfht8
	 * 				one can watch a similar getter in action in the View. I will be speaking to the professor
	 * 				at BYUI tonight to clarify further.
	 * 
	 * Created by: artieman1 Created on: Jan 24, 2019
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Purpose: When the user enters data into the prompts at the console, we must store it somewhere
	 * 				These getters are used to retrieve the data from the controller for storage into
	 * 				the model class.
	 * Created by: artieman1 Created on: Jan 24, 2019
	 *
	 * @return the petName
	 */
	public String getPetName() {
		return petName;
	}

	/**
	 * Purpose: When the user enters data into the prompts at the console, we must store it somewhere
	 * 				These getters are used to retrieve the data from the controller for storage into
	 * 				the model class.
	 *
	 * @return the favSchool
	 */
	public String getFavSchool() {
		return favSchool;
	}

	/**
	 * Purpose: When the user enters data into the prompts at the console, we must store it somewhere
	 * 				These getters are used to retrieve the data from the controller for storage into
	 * 				the model class.
	 *
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
}
