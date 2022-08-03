// Fig. 4.7: GradeBookTest.java
// Create GradeBook object and invoke its determineClassAverage method.

public class GradeBookTest
{
	// method begins program execution
	public static void main( String args[])
	{
		// create Gradebook object myGradeBook and
		// passs course name to constructor
		Gradebook myGradeBook = new Gradebook(
				"CS101 Introduction to Java Programming");
		myGradeBook.displayMessage(); // display welcome message
		myGradeBook.determineClassAverage();  // find average of 10 grades
	} // end method main
	
} // end class GradeBookTest
