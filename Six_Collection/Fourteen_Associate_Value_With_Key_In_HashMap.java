// Que. - 14. Write a Java program to associate the specified value with the specified key in a Hash Map.
package Six_Collection;

import java.util.HashMap;

public class Fourteen_Associate_Value_With_Key_In_HashMap 
{

    public static void main(String[] args) 
    {
        HashMap<String, String> colorCodes = new HashMap<>();

        colorCodes.put("Red", "#FF0000");
        colorCodes.put("Green", "#00FF00");
        colorCodes.put("Blue", "#0000FF");

        System.out.println("Color Codes: " + colorCodes);
    }
}
