package Collection;
import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List<Integer> L1 = new ArrayList<Integer>();
		L1.add(0, 1);     // adding to specific position
		L1.add(1, 2);        
		System.out.println(L1);
		
		List<Integer> L2 = new ArrayList<Integer>();
		L2.add(10); 	// adding without the index
		L2.add(20);
		System.out.println(L2);

		L1.addAll(L2);      // add a collection into another
		System.out.println(L1);
		
		L1.remove(2);        //removes element from the position 2
		System.out.println(L1);
		
		System.out.println(L1.get(2));

		L1.set(2, 100);
		System.out.println(L1);
		
		System.out.println(L1.indexOf(100));             //indexOf returns the index of an element
		
		List<String> L3 = new ArrayList<String>();
		L3.add("Geeks");
		//L1.add(L3);
	}
}
