/* Que. - 5. Write a program to print the area and perimeter of a triangle having sides of 3, 4 and  5 units by creating a class named 'Triangle' 
 without any parameter in its constructor.
 */
package Two_OOPs;

class Triangle 
{
    double side1;
    double side2;
    double side3;

    Triangle()
    {
        side1=3;
        side2=4;
        side3=5;
    }

    void printArea() 
    {
        double area=0.5*side1*side2;
        System.out.println("-->> Area Of Triangle : " + area);
    }

    void printPerimeter() 
    {
        double perimeter=side1+side2+side3;
        System.out.println("-->> Perimeter Of Triangle : " + perimeter);
    }
}

public class Five_Triangle_Area_Perimeter 
{
    public static void main(String[] args) 
    {
        Triangle triangle=new Triangle();

        triangle.printArea();
        triangle.printPerimeter();
    }
}
