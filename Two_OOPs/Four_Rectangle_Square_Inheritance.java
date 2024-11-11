/* Que. - 4. Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and parameter of the 
  rectangle respectively. Its constructor having parameters for length and breadth is used to initialize the length and breadth of the rectangle. 
  Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side (suppose s) calling the constructor of its
  parent class as 'super (s, s)'. Print the area and parameter of a rectangle and a square.
 */
package Two_OOPs;

public class Four_Rectangle_Square_Inheritance
{	
	class Rectangle 
	{
	    double length;
	    double breadth;

	    Rectangle(double length, double breadth) 
	    {
	        this.length=length;
	        this.breadth=breadth;
	    }

	    void printArea() 
	    {
	        double area=length*breadth;
	        System.out.println("-->> Area Of Rectangle : "+area);
	    }
	    
	    void printPerimeter() 
	    {
	        double perimeter=2*(length+breadth);
	        System.out.println("-->> Perimeter Of Rectangle : " + perimeter);
	    }
	}

	class Square extends Rectangle 
	{
	    Square(double side) 
	    {
	        super(side, side); // Call to the parent constructor with equal sides
	    }
	}
	
	public static void main(String[] args)
	{
		Four_Rectangle_Square_Inheritance outer=new Four_Rectangle_Square_Inheritance();

        Rectangle rectangle=outer.new Rectangle(5, 3);
        rectangle.printArea();
        rectangle.printPerimeter();

        Square square=outer.new Square(4);
        square.printArea();
        square.printPerimeter();
	}
}
