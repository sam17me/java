// Fig. 4.6: GradeBook.java
// GradBook class that solves class-average problem using
// counter-controlled repetition.
import java.util.Scanner;  // program uses class Scanner

public class Gradebook
{
	private String courseName; // name of course this GradeBook represents

	// constructor initializes courseName
	public Gradebook(String name)
	{
		courseName=name; // initializes coureName
	} // end constructor

	// method to set the course name
	public void setCourseName(String name)
	{
		courseName = name; // store the course name
	}  // end method setCourseName

	//method to retrieve the course name
	public String getCourseName()
	{
		return courseName;
	} // end method getCourseName

	// display a welcome message to the GradeBook User
	public void displayMessage()
	{
		//getCourseName gets the anme of the course
		 System.out.printf("Welcome to the grade book for \n%s!\n\n",
				 getCourseName());
	} // end method displayMessage

	// determin class average based on 10 grades entered by user
	public void determineClassAverage()
	{
		// create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);

		int total; // sum of grades entered by user
		int gradeCounter; // number of the grade to be enter next
		int grade;  // grade value entered by user
		int average; // average of grades

		// initilization phase
		total = 0; // initialize total
		gradeCounter = 1; // initialize loop counter

		// processing phase
		while(gradeCounter <= 10) // loop 10 times
		{
			System.out.print("Enter grade: "); // prompt
			grade = input.nextInt(); // input next grade
			total = total + grade; // add grade to total
			gradeCounter = gradeCounter + 1; // increment counter by 1
		} // end while

		// termination phase
		average = total/10; // interger division yields integer result

		// display total and average of grades
		System.out.printf("\nTotal of all 10 grades is %d\n", total);
		System.out.printf("Class average is %d\n", average);
	}

}  // end class Gradebook