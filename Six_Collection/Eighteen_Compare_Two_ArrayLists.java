// Que. - 18. Write a Java program to compare two array lists.
package Six_Collection;

import java.util.ArrayList;

public class Eighteen_Compare_Two_ArrayLists 
{

    public static void main(String[] args) 
    {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Blue");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Red");
        list2.add("Green");
        list2.add("Blue");

        // Compare the two ArrayLists
        boolean areEqual = list1.equals(list2);

        System.out.println("-->> Are The Two ArrayLists Equal ? " + areEqual);
    }
}
