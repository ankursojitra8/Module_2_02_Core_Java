// Que. - 9. Write a Java program to copy one array list into another.
package Six_Collection;

import java.util.ArrayList;

public class Nine_Copy_One_ArrayList_To_Another 
{

    public static void main(String[] args) 
    {
        ArrayList<String> originalColors=new ArrayList<>();
        originalColors.add("Red");
        originalColors.add("Green");
        originalColors.add("Blue");

        ArrayList<String> copiedColors=new ArrayList<>(originalColors);

        System.out.println("-->> Original ArrayList : " +originalColors);
        System.out.println("-->> Copied ArrayList : " +copiedColors);
    }
}