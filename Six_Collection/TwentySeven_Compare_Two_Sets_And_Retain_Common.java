// Que. - 27. Write a Java program to compare two sets and retain elements which are same on both sets.
package Six_Collection;

import java.util.HashSet;

public class TwentySeven_Compare_Two_Sets_And_Retain_Common 
{

    public static void main(String[] args) 
    {
        HashSet<String> set1=new HashSet<>();
        set1.add("Red");
        set1.add("Green");
        set1.add("Blue");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Green");
        set2.add("Yellow");
        set2.add("Blue");

        set1.retainAll(set2);	// Retain only the elements that are common to both sets

        System.out.println("-->> Common Elements: " +set1);
    }
}
