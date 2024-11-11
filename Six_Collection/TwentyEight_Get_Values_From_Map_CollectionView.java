// Que. - 28. Write a Java program to get a collection view of the values contained in this map.
package Six_Collection;

import java.util.HashMap;
import java.util.Collection;
import java.util.Map;

public class TwentyEight_Get_Values_From_Map_CollectionView 
{

    public static void main(String[] args) 
    {
        Map<String, String> map=new HashMap<>();
        map.put("1", "Red");
        map.put("2", "Green");
        map.put("3", "Blue");

        Collection<String> values=map.values();

        System.out.println("-->> Values In The Map : " +values);
    }
}
