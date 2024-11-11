// Que. - 12. Write a Java program to iterate through all elements in a hash list.
package Six_Collection;

import java.util.HashSet;

public class Twelve_Iterate_HashSet_Elements 
{

    public static void main(String[] args) 
    {
        HashSet<String> colors=new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Iterate through the HashSet and print each color
        for (String color : colors) 
        {
            System.out.println(color);
        }
    }
}

