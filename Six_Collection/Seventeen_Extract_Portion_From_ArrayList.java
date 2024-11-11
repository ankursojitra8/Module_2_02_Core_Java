// Que. - 17. Write a Java program to reverse elements in an array list.
package Six_Collection;

import java.util.ArrayList;

public class Seventeen_Extract_Portion_From_ArrayList 
{

    public static void main(String[] args) 
    {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        ArrayList<String> extractedColors=new ArrayList<>(colors.subList(1, 4));        // Extract a portion of the ArrayList (from index 1 to index 3)

        System.out.println("Original ArrayList: " +colors);
        System.out.println("Extracted Portion: " +extractedColors);
    }
}
