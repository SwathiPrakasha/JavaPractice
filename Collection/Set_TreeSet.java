package Collection;

import java.util.Set;
import java.util.TreeSet;

/*
 * TreeSet implements Set, SortedSet and NavigableSet interfaces.
 * TreeSet is similar to HashSet except that it stores element’s in Sorted Order.
 */
public class Set_TreeSet {

	public static void main(String[] args) {
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("Sachin");
		System.out.println(treeSet);//[Sachin]
		
		treeSet.add("Dravid");
		System.out.println(treeSet);//[Dravid, Sachin]
		
		treeSet.add("Ganguly");
		System.out.println(treeSet);//[Dravid, Ganguly, Sachin]
		
		treeSet.add("Sachin");//returns false since element is not added
		System.out.println(treeSet);//[Dravid, Ganguly, Sachin]
	}
}
