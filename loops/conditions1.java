package loops;
/*
Task 
Given an integer, , perform the following conditional actions:
If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird

if n<1 n>100 weird
*/

import java.util.*;

public class conditions1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N ;//= scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        while((N = scanner.nextInt()) > 0) {
        
        if (N<1 && N>100) 
        	System.out.println("Weird");
        
        else if (N%2 == 0) {
             if( N >= 2 && N <= 5) 
                System.out.println("Not Weird");
             if (N >= 6 && N<=20) 
                System.out.println("Weird");
             if (N >20) 
                System.out.println("Not Weird");     
        	}
        else 
            System.out.println("Weird");
        }
              
    
        scanner.close();
    }
}
