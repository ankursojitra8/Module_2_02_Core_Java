// Que. - 15.  Write a Java program to count the number of key-value (size) mappings in a map.
package Six_Collection;

import java.util.HashMap;

public class Fifteen_Count_Key_Value_Mappings_In_Map 
{

    public static void main(String[] args) 
    {
        HashMap<String, String> colorCodes=new HashMap<>();

        colorCodes.put("Red", "#FF0000");
        colorCodes.put("Green", "#00FF00");
        colorCodes.put("Blue", "#0000FF");
        
        int size = colorCodes.size();	        // Count the number of key-value mappings in the HashMap

        System.out.println("Number of key-value mappings in the map: " + size);
    }
}
