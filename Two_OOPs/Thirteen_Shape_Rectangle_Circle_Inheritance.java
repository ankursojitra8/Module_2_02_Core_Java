/* Que. - 13. Create a class named 'Shape' with a method to print "This is this is shape". Then create two other classes named 'Rectangle', 
 'Circle' inheriting the Shape class, both having a method to print "This is rectangular shape" and "This is circular shape" respectively. 
 Create a subclass 'Square' of 'Rectangle' having a method to print "Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' 
 class by the object of 'Square' class.
*/

package Two_OOPs;

class BaseShape 
{
    void display() 
    {
        System.out.println("-->> This is a shape.");
    }
}

class RectShape extends BaseShape 
{
    void display() 
    {
        System.out.println("-->> This is a rectangular shape.");
    }
}

class CircShape extends BaseShape 
{
    void display() 
    {
        System.out.println("-->> This is a circular shape.");
    }
}

class SqShape extends RectShape 
{
    void display() 
    {
        System.out.println("-->> Square is a rectangle.");
    }
}

public class Thirteen_Shape_Rectangle_Circle_Inheritance 
{
    public static void main(String[] args) 
    {
        SqShape square=new SqShape();
        
        square.display();
        ((RectShape) square).display();
        ((BaseShape) square).display();
    }
}
