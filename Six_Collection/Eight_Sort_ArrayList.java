// Que. - 8. Write a Java program to sort a given array list.
package Six_Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Eight_Sort_ArrayList 
{

    public static void main(String[] args) 
    {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        Collections.sort(colors);

        System.out.println("-->> Sorted ArrayList : " +colors);
    }
}
