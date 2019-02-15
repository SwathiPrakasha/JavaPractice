package Exceptions;
/*Static Intialization 
 * Static initialization blocks are executed when the class is loaded, 
 * and you can initialize static variables in those blocks.
 
 There are two lines of input. 
 The first line contains : the breadth of the parallelogram. 
 The next line contains : the height of the parallelogram.

If both values are greater than zero, then the main method must output the area of the parallelogram. 
Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
 */
import java.util.*;
public class exception1{
	
	private static final Scanner scan = new Scanner(System.in);
    static boolean flag = true;
    static int B= scan.nextInt();
    static int H = scan.nextInt();
    static{
        try{
            if (B<=0 ||H <=0){
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        }
    
    public static void main(String args[]) {
    	if(flag) {
    		int area = B*H;
    		System.out.println(area);
    	}
    }
}