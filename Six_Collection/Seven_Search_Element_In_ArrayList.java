// Que. - 7. Write a Java program to search an element in an array list.
package Six_Collection;

import java.util.ArrayList;

public class Seven_Search_Element_In_ArrayList 
{

    public static void main(String[] args) 
    {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        String searchColor="Blue";

        boolean found = colors.contains(searchColor);

        if (found) 
        {
            System.out.println(searchColor + " Is Found In The ArrayList.");
        } 
        else 
        {
            System.out.println(searchColor + " is Not Found In The ArrayList.");
        }
    }
}