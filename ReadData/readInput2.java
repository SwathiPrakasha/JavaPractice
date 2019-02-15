package ReadData;
/*
INPUT
42
3.1415
Welcome to HackerRank's Java tutorials!

OUTPUT 
String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42
*/

import java.util.Scanner;

public class readInput2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String line = scan.nextLine();    // This reads just a \n which was pointed by nextDouble()
        String lin2 = scan.nextLine();
        scan.close();
        
        
        //String str = Arrays.toString(s);
        System.out.println("String: " + lin2);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}