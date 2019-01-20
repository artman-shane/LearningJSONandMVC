/*
 * Learning.java
 *
 * The Learning.java Class for the Learning project
 * Created in the learning package.
 * 
 * Created on Jan 19, 2019 at 2:17:11 PM
 * Created by artieman1
 *
 *
 * Purpose: <What is the purpose of the file?>
 */


package learning;
import controller.*;
import model.*;
import view.*;

import java.io.Serializable;


/**
 * @author artieman1
 *
 */
public class Learning implements Serializable{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student student = new Student();
		StudentDataView view = new StudentDataView();
		JsonControl controller = new JsonControl(); 
		student.addView(view);
		controller.addModel(student);
		controller.addView(view);
		view.addModel(student);
		view.addController(controller);
		
		controller.getUserInput();
		controller.showStudentData();
	}

}

