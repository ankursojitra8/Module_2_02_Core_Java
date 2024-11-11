// Que. - 24. Write a Java program to increase the size of an array list.
package Six_Collection;

import java.util.ArrayList;

public class TwentyFour_Increase_Size_Of_ArrayList 
{

    public static void main(String[] args) 
    {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");

        System.out.println("-> Original Size : " + colors.size());

        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("-->> New Size : " + colors.size());
    }
}
