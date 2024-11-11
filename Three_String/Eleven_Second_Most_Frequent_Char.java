/* Que. - 11. W.A.J.P to find the second most frequent character in a given string. The given string
is: successes The second most frequent char in the string is: c
 */
package Three_String;
public class Eleven_Second_Most_Frequent_Char
{
    public static void main(String[] args) 
    {
        String str="successes";
        char secondMostFrequent=findSecondMostFrequent(str);
        System.out.println("-->> The Second Most Frequent Char In The String Is : " + secondMostFrequent);
    }

    static char findSecondMostFrequent(String str) 
    {
        int[] freq=new int[256];
        for (char c : str.toCharArray()) freq[c]++;
        int first=0, second=0;
        char firstChar='\0', secondChar='\0';

        for (char c=0; c<256; c++)
        {
            if (freq[c]>freq[first])
            {
                second=first;
                secondChar=firstChar;
                first=c;
                firstChar=c;
            } 
            else if (freq[c]>freq[second] && c!=first)
            {
                second=c;
                secondChar=c;
            }
        }
        return secondChar;
    }
}
