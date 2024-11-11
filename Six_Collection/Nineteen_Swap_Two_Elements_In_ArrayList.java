// Que. - 19. Write a Java program of swap two elements in an array list.
package Six_Collection;

import java.util.ArrayList;

public class Nineteen_Swap_Two_Elements_In_ArrayList
{

    public static void main(String[] args) 
    {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        int index1=1, index2=2;	        // Swap elements at index 1 and index 2
        String temp=colors.get(index1);
        colors.set(index1, colors.get(index2));
        colors.set(index2, temp);
        
        System.out.println("ArrayList after swapping: " + colors);
    }
}
