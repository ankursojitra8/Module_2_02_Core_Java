// Que. - 2. Write a Java program to iterate through all elements in an array list.
package Six_Collection;

import java.util.ArrayList;

public class Two_Iterate_ArrayList_Elements 
{

    public static void main(String[] args) 
    {
        ArrayList<String> colors=new ArrayList<>();
        colors.add(":) Red");
        colors.add(":) Green");
        colors.add(":) Blue");

        for (String color:colors) 
        {
            System.out.println(color);
        }
    }
}

