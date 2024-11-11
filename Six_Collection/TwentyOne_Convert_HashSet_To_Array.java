// Que. - 21. Write a Java program to convert a hash set to an array.
package Six_Collection;

import java.util.HashSet;

public class TwentyOne_Convert_HashSet_To_Array
{

    public static void main(String[] args)
{
        // Create and initialize a HashSet with colors
        HashSet<String> colors=new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        String[] colorsArray=colors.toArray(new String[0]);

        System.out.println("Array From HashSet: ");
        for (String color:colorsArray) 
        {
            System.out.println(color);
        }
    }
}
