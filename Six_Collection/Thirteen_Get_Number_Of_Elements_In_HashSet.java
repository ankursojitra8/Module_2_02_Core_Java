// Que. - 13. Write a Java program to get the number of elements in a hash set.
package Six_Collection;

import java.util.HashSet;

public class Thirteen_Get_Number_Of_Elements_In_HashSet 
{

    public static void main(String[] args) 
    {
        HashSet<String> colors=new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        int size=colors.size();

        System.out.println("-->> Number Of Elements In The HashSet : " + size);
    }
}

