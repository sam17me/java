// Fig. 3.7: GradeBook.java
// GradeBook class that contains a courseName instance variable
// and methos to set and get its value


public class Gradebook
{
	private String courseName;  // course name for this GradeBook 
	
	// method to set the course name
	public void setCourseName( String name)
	{
		courseName= name; // store the course name
	}  // end method setCourseName
	
	// nethod to retrieve the course name
	public String getCourseName()
	{
		return courseName;
	} // end method getCourseName
	
	// display a welcome message to the GradeBook User
	public void displayMessage()
	{
		// this statement calls getCourseName to get the
		// ame of the course this GradeBook represents
		System.out.printf("Welcome to the grade book for\n%s!\n", getCourseName() );
	}  // end method displayMessage	
}
