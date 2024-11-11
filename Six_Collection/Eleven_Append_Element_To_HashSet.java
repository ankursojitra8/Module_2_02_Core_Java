// Que. - 11. Write a Java program to append the specified element to the end of a hash set.
package Six_Collection;

import java.util.HashSet;

public class Eleven_Append_Element_To_HashSet 
{

    public static void main(String[] args) 
    {
        HashSet<String> colors=new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        String newColor=":) Yellow";

        colors.add(newColor);

        System.out.println("-->> Updated HashSet : " + colors);
    }
}
