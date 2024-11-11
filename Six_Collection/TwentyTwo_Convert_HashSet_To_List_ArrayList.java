// Que. - 22. Write a Java program to convert a hash set to a List/Array List
package Six_Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TwentyTwo_Convert_HashSet_To_List_ArrayList 
{

    public static void main(String[] args) 
    {
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        List<String> colorsList = new ArrayList<>(colors);

        System.out.println("-->> ArrayList From HashSet: " + colorsList);
    }
}
