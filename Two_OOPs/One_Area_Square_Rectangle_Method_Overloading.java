/* Que. - 1. Create a class to print the area of a square and a rectangle. The class has two methods with the same name but different number of 
parameters. 
 The method for printing area of a rectangle has two parameters which are length and breadth respectively while the other method for printing area of 
 square has one parameter which is side of square.
*/

package Two_OOPs;

public class One_Area_Square_Rectangle_Method_Overloading
{
    void printArea(int side) 
    {
        System.out.println("-->> Area Of Square : "+(side*side));
    }

    void printArea(int length, int breadth) 
    {
        System.out.println("-->> Area Of Rectangle : "+(length*breadth));
    }
   
	public static void main(String[] args) 
	{
		One_Area_Square_Rectangle_Method_Overloading areaCalculator=new One_Area_Square_Rectangle_Method_Overloading();
        
        areaCalculator.printArea(5);
        areaCalculator.printArea(4, 6);
	}
}
