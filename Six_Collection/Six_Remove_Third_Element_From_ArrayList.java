// Que. - 6. Write a Java program to remove the third element from an array list.
package Six_Collection;

import java.util.ArrayList;

public class Six_Remove_Third_Element_From_ArrayList 
{

    public static void main(String[] args) 
    {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        colors.remove(2);

        System.out.println(colors);
    }
}