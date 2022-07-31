// Fig. 3.11:  GradeBookTest.java
 //  GradeBook constructor used to specifiy the course name at the
// time each GradeBook object is created

public class GradeBookTest
{
	// method begins program execution
	public static void main( String args[])
	{
		// create Gradebook ojbect
		Gradebook gradeBook1 = new Gradebook(
				"CS101 Introduction to Java Programming");
		Gradebook gradeBook2 = new Gradebook(
				"CS102 Data Structures in Java");
		// display initial value of courseName for ech GradeBook
		System.out.printf("gradeBook1 course name is: %s\n",
				gradeBook1.getCourseName());
		System.out.printf("gradeBook2 course name is: %s\n",
				gradeBook2.getCourseName());
	} // end method main
	
} // end class GradeBookTest
