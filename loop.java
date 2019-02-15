/*Given an integer, , print its first  multiples. Each multiple  (where ) 
 should be printed on a new line in the form: N x i = result.

Input Format
		A single integer, .

Constraints
  2<= N <=20

Output Format
	Print  lines of output; each line  (where ) contains the  of  in the form: 
	N x i = result.

 */
import java.util.*;
import java.util.regex.*;

public class loop {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i=1;i<11;i++){
            System.out.printf("%d x %d = %d\n", N, i, N*i);
        }
        scanner.close();
    }
}