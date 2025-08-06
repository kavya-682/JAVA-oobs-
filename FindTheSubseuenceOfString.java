/*To check whether t can be found as a subsequence in s, 
you need to determine if you can delete some (or no) characters from s so that the resulting string is t, 
without reordering the remaining characters. */

package in.java;

public class FindTheSubseuenceOfString {
	public static boolean isSubsequence(String s, String t) 
	{
      int tIndex = 0;
      for (int i = 0; i < s.length() ; i++) 
      {
	    if (s.charAt(i) == t.charAt(tIndex)) 
	    {
		    tIndex++;
	    }
      }
	  return tIndex == t.length();
    }

    public static void main(String[] args) 
    {
		  String s = "hereiamstackerrank";
		  String t = "hackerrank";
		   if (isSubsequence(s, t)) 
		   {
		        System.out.println("yes");
		   } 
		   else 
		   {
		      System.out.println("no");
		   }
    }
}


	
