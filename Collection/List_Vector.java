package Collection;
import java.util.Vector;

/*
 * The Vector class implements a growable array of objects. 
 * Vectors basically falls in legacy classes but now it is fully compatible with collections.
 * https://www.geeksforgeeks.org/java-util-vector-class-java/
 */

public class List_Vector {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add("Geeks");
		v.add(" were working");
        System.out.println("Vector is " +v);
	}
}

