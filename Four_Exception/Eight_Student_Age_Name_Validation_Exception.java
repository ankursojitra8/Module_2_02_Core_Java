/* Que. - 8. W.A.J.P to create a class Student with attributes roll no, name, age and course.  Initialize values through parameterized constructor. If 
 age of student is not in  between 15 and 21 then generate user defined exception "AgeNotWithinRangeException". If name contains numbers or special
 symbols raise exception "NameNotValidException". Define the two exception classes.
*/
package Four_Exception;

class AgeNotWithinRangeException extends Exception 
{
		 public AgeNotWithinRangeException(String message)
		{
		     super(message);
		}
		}
		
		class NameNotValidException extends Exception
		{
		 public NameNotValidException(String message)
		{
		     super(message);
		 }
		}
		
		class Student {
		 private int rollNo;
		 private String name;
		 private int age;
		 private String course;
		
		 public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException
		{
		     if (age<15 || age>21) 
		     {
		         throw new AgeNotWithinRangeException("-->> Age Must Be Between 15 And 21.");
		     }
		     if (!name.matches("[a-z A-Z ]+"))
		{
		         throw new NameNotValidException("-->> Name Contains Invalid Characters.");
		     }
		     this.rollNo=rollNo;
		     this.name=name;
		     this.age=age;
		     this.course=course;
		 }
		
		 public void display() 
		 {
		     System.out.println("Roll No: " +rollNo+ ", Name: " +name+ ", Age: " +age+ ", Course: " +course);
		 }
}

public class Eight_Student_Age_Name_Validation_Exception 
{
 public static void main(String[] args) 
 {
     try 
     {
         Student student=new Student(123, "Ankur Sojitra", 18, "Bachlor Business Administration");
         student.display();

         // Student invalidAgeStudent = new Student(2, "Axay", 22, "Mathematics"); // Invalid age
         // Student invalidNameStudent = new Student(3, "Meet", 19, "Physics"); // Invalid name
     } 
     catch (AgeNotWithinRangeException | NameNotValidException e) 
     {
         System.out.println("Exception: " + e.getMessage());
     }
 }
}
