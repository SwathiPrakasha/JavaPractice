/*Input
java 100
cpp 65
python 50

Output  - String left justified 15 characters, digits 3 character
================================
java           100 
cpp            065 
python         050 
================================
 */
import java.util.* ;

public class outputFormat{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=scan.next();
            int x=scan.nextInt();
            System.out.printf("%-14s %03d\n", s1,x);
        }
        
        System.out.println("================================");
	}
	
}



