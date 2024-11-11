// Que. - 4. Write a Java program to retrieve an element (at a spec. index) from a given array list.
package Six_Collection;

import java.util.ArrayList;

public class Four_Retrieve_Element_By_Index 
{

    public static void main(String[] args) 
    {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        
        int index=2;

        String colorAtIndex=colors.get(index);	// Retrieve the element at the specified index

        System.out.println("Color At Index " + index + " : " +colorAtIndex);
    }
}
