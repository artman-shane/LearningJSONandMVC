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
public class Learning {

	/**
	 * @param args
	 */
	public static void main(String[] args) implements Serializable {
		Student student = new Student();
		StudentDataView view = new StudentDataView();
		PlayWithJSONController controller = new PlayWithJSONController(student, view); 

	}

}

