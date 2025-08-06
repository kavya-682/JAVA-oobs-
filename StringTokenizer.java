import java.util.StringTokenizer;

public class StringToenizer {

	public static void main(String[] args) {
		String s = "Java PYTHON SQL AI";
		StringTokenizer st = new StringTokenizer(s," ");
          while(st.hasMoreTokens()) {
        	  System.out.println(st.nextToken());
          }
	}

}
/*
----------output -------
Java
PYTHON
SQL
AI
*/
