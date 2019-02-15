package Collection;

import java.util.HashSet;
import java.util.Set;

/*HashSet implements set interface. So, HashSet does not allow duplicates. 
 *However, HashSet does not support ordering.
 The order in which elements are inserted is not maintained.
 */
public class Set_HashSet {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<String>();
		
		hashSet.add("Sachin");
		System.out.println(hashSet);
		
		hashSet.add("Rahul Dravid");
		hashSet.add("Sachin");
		hashSet.add("M S Dhoni");
		hashSet.add("Harbhanjan Singh");
		hashSet.add("Virat Kholi");
		hashSet.add("Shewagh");
		
		System.out.println(hashSet);
	}

}
