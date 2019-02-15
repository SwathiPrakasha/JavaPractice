package Collection;

import java.util.LinkedHashSet;
import java.util.Set;

/*
 * LinkedHashSet implements set interface and exposes similar operations to a HashSet. 
 * Difference is that LinkedHashSet maintains insertion order.
 * When we iterate a LinkedHashSet, we would get the elements back in the order in which they were inserted.
 */
public class Set_LinkedHashSet {
	public static void main(String[] args) {
	Set<String> L_HashSet = new LinkedHashSet<String>();
	
	L_HashSet.add("Sachin");
	System.out.println(L_HashSet);
	
	L_HashSet.add("Rahul Dravid");
	L_HashSet.add("Sachin");
	L_HashSet.add("M S Dhoni");
	L_HashSet.add("Harbhanjan Singh");
	L_HashSet.add("Virat Kholi");
	L_HashSet.add("Shewagh");
	
	System.out.println(L_HashSet);
	}
}