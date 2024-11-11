// Que. - 1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
package Six_Collection;

import java.util.ArrayList;

public class One_Add_Colors_To_ArrayList 
{

    public static void main(String[] args) 
    {
        ArrayList<String> colors=new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("-->> Colors In the ArrayList : " +colors);
    }
}
