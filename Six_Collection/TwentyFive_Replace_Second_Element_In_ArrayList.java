// Que. - 25. Write a Java program to replace the second element of an Array List with the specified element.
package Six_Collection;

import java.util.ArrayList;

public class TwentyFive_Replace_Second_Element_In_ArrayList 
{

    public static void main(String[] args) 
    {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("-> Original ArrayList : " + colors);

        colors.set(1, "Yellow");

        System.out.println("-->> Updated ArrayList : " + colors);
    }
}
