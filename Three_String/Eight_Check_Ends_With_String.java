/* Que. - 8. W.A.J.P to check whether a given string ends with the contents of another string. "Java Exercises" ends with "se"? False "Java Exercise"
  ends with "se"? True 
 */
package Three_String;

public class Eight_Check_Ends_With_String 
{
    public static void main(String[] args) 
    {
        String mainString1="Java Exercises";
        String sx1="se";
        
        String mainString2="Java Exercise";
        String sx2="se";

        boolean endsWithSx1=mainString1.endsWith(sx1);	// For Check if main strings end with the specified suffixes
        boolean endsWithSx2=mainString2.endsWith(sx2);

        System.out.println("-->> \"" +mainString1+ "\" Ends With \"" +sx1+ "\"? " +endsWithSx1); // false
        System.out.println("-->> \"" +mainString2+ "\" Ends With \"" +sx2+ "\"? " +endsWithSx2); // true
    }
}

