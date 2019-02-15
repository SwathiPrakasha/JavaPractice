/*You are given an integer , you have to convert it into a string.
 * 
 */
import java.util.*;

public class int2string{
	public static void main(String arga[]) {
		
			Scanner scan= new Scanner(System.in);
			int n = scan.nextInt();
			scan.close();
			
			String s = String.valueOf(n);
			System.out.printf("Number in stringtype %s\n", s);
			
			int num = Integer.parseInt(s);
			System.out.printf("Integer %d\n", num);
	}
	
}