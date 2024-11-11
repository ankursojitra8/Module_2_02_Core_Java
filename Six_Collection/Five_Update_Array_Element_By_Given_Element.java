// Que. - 5. Write a Java program to update specific array element by given element.
package Six_Collection;

import java.util.ArrayList;

public class Five_Update_Array_Element_By_Given_Element 
{

    public static void main(String[] args) 
    {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        String oldColor="Green"; // Correctly set to match the existing color
        String newColor="-> Yellow";

        int index = colors.indexOf(oldColor);
        if (index!=-1) 
        {
            colors.set(index, newColor); // Update the color at the found index
        } 
        else 
        {
            System.out.println("-->> Old Color Not Found In The List.");
        }
        System.out.println(colors);
    }
}

