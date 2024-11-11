// Que. - 20. Write a Java program to join two array lists.
package Six_Collection;

import java.util.ArrayList;

public class Twenty_Join_Two_ArrayLists
{

    public static void main(String[] args)
    {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Green");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Blue");
        list2.add("Yellow");

        list1.addAll(list2); // Join the two ArrayLists

        System.out.println("Joined ArrayList: " + list1);
    }
}
