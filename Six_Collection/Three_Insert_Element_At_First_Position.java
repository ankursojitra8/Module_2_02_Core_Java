// Que. - 3. Write a Java program to insert an element into the array list at the first position.
package Six_Collection;

import java.util.ArrayList;

public class Three_Insert_Element_At_First_Position 
{

    public static void main(String[] args) 
    {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("Green");
        colors.add("Blue");

        colors.add(2, "-->> Insert The :) Red");

        System.out.println(colors);
    }
}
