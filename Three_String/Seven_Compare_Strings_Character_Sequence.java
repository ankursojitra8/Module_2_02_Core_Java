/* Que. - 7. W.A.J.P to compare a given string to the specified character sequence. Comparing  topsint.com and topsint.com: true Comparing Topsint.com 
 and topsint.com: false
 */
package Three_String;

public class Seven_Compare_Strings_Character_Sequence 
{
    public static void main(String[] args) 
    {
        String str1="topsint.com";
        String str2="topsint.com";
        String str3="Topsint.com";

        boolean comparison1=str1.equals(str2);
        boolean comparison2=str1.equals(str3);

        System.out.println("-->> Comparing \"" +str1+ "\" And \"" +str2+ "\" : " +comparison1); // true
        System.out.println("-->> Comparing \"" +str3+ "\" And \"" +str1+ "\" : " +comparison2); // false
    }
}

