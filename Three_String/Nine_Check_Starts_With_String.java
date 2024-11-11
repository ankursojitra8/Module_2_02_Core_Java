/* Que. - 9. W.A.J.P to check whether a given string starts with the contents of another string. Red is favorite color. Starts with Red? 
 True Orange is also my favorite color. Starts with Red? False I3.
 */
package Three_String;

public class Nine_Check_Starts_With_String 
{
    public static void main(String[] args) 
    {
        String mainString1="Red Is My Favorite Color.";
        String prefix1="Red";

        String mainString2="Orange Is Also My Favorite Color.";
        String prefix2="Red";

        boolean startsWithPrefix1=mainString1.startsWith(prefix1);
        boolean startsWithPrefix2=mainString2.startsWith(prefix2);

        System.out.println("-->> \"" + mainString1+ "\"     -->> Starts With \"" +prefix1+ "\"? " +startsWithPrefix1); // true
        System.out.println("-->> \"" + mainString2+ "\"     -->> Starts With \"" +prefix2+ "\"? " +startsWithPrefix2); // false
    }
}
