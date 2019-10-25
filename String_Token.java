import java.util.*;
public class String_Token {
	public static void main(String[] args) {		
		int sum = 0;
		int c = 0;
                String str = "10 10 20 30";
		StringTokenizer st = new StringTokenizer(str);
		
	    while(st.hasMoreTokens())
	    {
	    	c = st.countTokens();
	    	sum += Integer.parseInt(st.nextToken());
	    }
	    System.out.println("Sum :"+sum);
	}
}