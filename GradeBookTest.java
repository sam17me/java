// Fig. 3.2:  GradeBookTest.java
 //  Create and manipulate a GradeBook object.
 import java.util.Scanner; // program uses Scanner

public class GradeBookTest
{
	// method begins program execution
	public static void main( String args[])
	{
		// create Scanner to obtain inut from command window
		Scanner input = new Scanner(System.in);
		
		// create a GradeBook object and assign it to myGradeBook
		Gradebook myGradeBook = new Gradebook();

		// display intial alue of corseName
		System.out.printf("Initial course name is: %s\n\n",
			myGradeBook.getCourseName());
			
		// promt for and input course name
		System.out.println("Please enter the course name:");
		String theName = input.nextLine(); // read a line of text
		myGradeBook.setCourseName( theName); // set the course name
		System.out.println();  // outputs a blank line
		
		// display welcome message after specifying course name
		myGradeBook.displayMessage();
	} // end method main
	
} // end class GradeBookTest
