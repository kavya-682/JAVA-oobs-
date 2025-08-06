package in.java;

public class StringMethods {

	public static void main(String[] args) {
		String string = "TAP ACADEMY";
		System.out.println(string.toUpperCase());  
		//  output >>  TAP ACADEMY
		String convertedString = string.toLowerCase();
		System.out.println(convertedString); 
		// output >> tap academy
		System.out.println(string.charAt(4)); // this gives the character at index 4;  output >> a
		System.out.println(convertedString.indexOf('A')); //if there is no matching character in this string that give -1.
		
		System.out.println(convertedString.indexOf('a'));  // output>> 1;
		System.out.println(convertedString.lastIndexOf('a'));// 6
		System.out.println(convertedString.startsWith("tap"));//true
		System.out.println(convertedString.startsWith("TAP"));//false
		
		System.out.println(convertedString.endsWith("TAP"));  // output>> false;
		
		System.out.println(convertedString.substring(4));  // output>> academy
		System.out.println(convertedString.substring(4,7));  // this gives the output except the last index (upto 6), 
		//output >> aca
		
		
		String newString ="    how are you  ";
		String trimedString = newString.trim();
		System.out.println(newString.trim());  // output>>"how are you"
		String[] stringArray = trimedString.split(" ");
		for(int i=0;i<stringArray.length;i++)
		{
			System.out.println(stringArray[i] );
		}
		/* output >> 
		how
		are
		you
		*/
	}

}
