/* Que. - 2. Create a class with a method that prints "This is a parent class" and its subclass with another method that prints "This is child class". 
  Now, create an object for each of the class and call 1 - method of parent class by object of parent class 2 - method of child class by object of 
  child class 3 - method of parent class by object of child class
 */
package Two_OOPs;

public class Two_Print_Parent_Child_Class_Methods 
{
	class ParentClass 
	{
        void printMessage() 
        {
            System.out.println("-->> This Is A Parent Class");
        }
    }

    class ChildClass extends ParentClass 
    {
        void printMessage() 
        {
            System.out.println("-->> This Is A Child Class");
        }
    }
	
	public static void main(String[] args) 
	{
		Two_Print_Parent_Child_Class_Methods outer=new Two_Print_Parent_Child_Class_Methods();

        ParentClass parent=outer.new ParentClass();	// 1 - Method of parent class by object of parent class
        parent.printMessage();

        ChildClass child=outer.new ChildClass();	// 2 - Method of child class by object of child class
        child.printMessage();

        ((ParentClass) child).printMessage();	// 3 - Method of parent class by object of child class
	}
}
