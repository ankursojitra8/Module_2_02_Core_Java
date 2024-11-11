// Que. - 16. Write a Java program to reverse elements in an array list.
package Six_Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Sixteen_Reverse_Elements_In_ArrayList 
{

    public static void main(String[] args) 
    {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        Collections.reverse(colors);

        System.out.println("Reversed ArrayList: " + colors);
    }
}

