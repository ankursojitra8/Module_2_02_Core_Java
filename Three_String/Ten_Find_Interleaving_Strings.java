/* Que. - 10. W.A.J.P to find all interleaving of given strings. The given strings are: WX YZ 
 The interleaving strings are: YWZX WYZX YWXZ WXYZ YZWX WYXZ
 */
package Three_String;

import java.util.HashSet;

public class Ten_Find_Interleaving_Strings 
{
    
    public static void main(String[] args) 
    {
        String str1="WX";
        String str2="YZ";
        HashSet<String> resultSet=new HashSet<>();

        findInterleavings(str1, str2, "", resultSet);

        System.out.println("-->> The Interleaving Strings Are : " + resultSet);
    }

    private static void findInterleavings(String str1, String str2, String interleaved, HashSet<String> resultSet) 
    {
        if (str1.isEmpty() && str2.isEmpty())        // If both strings are empty  and add the interleaved string to the set
        {
            resultSet.add(interleaved);
            return;
        }
        
        if (!str1.isEmpty()) 
        {
            findInterleavings(str1.substring(1), str2, interleaved+str1.charAt(0), resultSet);
        }
        
        if (!str2.isEmpty()) 
        {
            findInterleavings(str1, str2.substring(1), interleaved+str2.charAt(0), resultSet);
        }
    }
}
