/* Que. - 12. We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' with three abstract methods 
namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The parameters of 'RectangleArea' are
its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius. Now create another class 'Area' containing all 
the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively. Create an 
object of class 'Area' and call all the three methods.Write a program which will ask the user to enter his/her marks (out of 100). Define a method
that will display grades according to the marks entered as below:
	Marks Grade :
				1-100 		A
				1-90 		B
				1-80 		B
				1-70 		C
				1-60 		D
				41-50 		D
				40 			Fail
 */
package Two_OOPs;
import java.util.Scanner;

abstract class Shape 
{
    abstract void RectangleArea(double length, double breadth);
    abstract void SquareArea(double side);
    abstract void CircleArea(double radius);
}

class Area extends Shape 
{
    void RectangleArea(double length, double breadth) 
    {
        System.out.println("-> Rectangle Area : " + (length * breadth));
    }
    void SquareArea(double side) 
    {
        System.out.println("-> Square Area : " + (side * side));
    }
    void CircleArea(double radius) 
    {
        System.out.println("-> Circle Area : " + (Math.PI * radius * radius));
    }
}

public class Twelve_Display_Grades_Based_On_Marks 
{
    static void displayGrade(int marks) 
    {
        if (marks>90) System.out.println("-->> Grade: A");
        else if (marks>80) System.out.println("-->> Grade : B");
        else if (marks>70) System.out.println("-->> Grade : C");
        else if (marks>60) System.out.println("-->> Grade : D");
        else if (marks>=41) System.out.println("-->> Grade : D");
        else System.out.println("-->> Grade : Fail");
    }

    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);

        Area area=new Area();
        area.RectangleArea(5, 10);
        area.SquareArea(7);
        area.CircleArea(3.5);

        System.out.print("-> Enter Your Marks (0-100): ");
        int marks=scanner.nextInt();
        displayGrade(marks);

    }
}
