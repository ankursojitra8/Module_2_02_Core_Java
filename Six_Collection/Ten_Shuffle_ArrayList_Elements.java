// Que. - 10. Write a Java program to shuffle elements in an array list.
package Six_Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Ten_Shuffle_ArrayList_Elements 
{

    public static void main(String[] args) 
    {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        Collections.shuffle(colors);

        System.out.println("-->> Shuffled ArrayList : " +colors);
    }
}
