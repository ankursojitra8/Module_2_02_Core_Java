// Que. - 26. Write a Java program to print all the elements of an Array List using the position of the elements.
package Six_Collection;

import java.util.ArrayList;

public class TwentySix_Print_Elements_Using_Position 
{

    public static void main(String[] args) 
    {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Elements Of The ArrayList:");
        for (int i = 0; i<colors.size(); i++) 
        {
            System.out.println("Element At Index " + i + " :  " + colors.get(i));
        }
    }
}
