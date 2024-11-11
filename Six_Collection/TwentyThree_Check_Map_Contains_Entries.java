// Que. - 23. Write a Java program to check whether a map contains key-value mappings (empty) or not.
package Six_Collection;

import java.util.HashMap;
import java.util.Map;

public class TwentyThree_Check_Map_Contains_Entries 
{

    public static void main(String[] args) 
    {
        Map<String, String> map = new HashMap<>();

        if (map.isEmpty()) 
        {
            System.out.println("-->> The Map Is Empty.");
        } 
        else 
        {
            System.out.println("-->> The Map Contains Entries.");
        }

        map.put("Key1", "Value1");

        if (map.isEmpty()) {
            System.out.println("-->> The Map Is Empty.");
        } else {
            System.out.println("-->> The Map Contains Entries.");
        }
    }
}
