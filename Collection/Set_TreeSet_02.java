package Collection;

import java.util.TreeSet;

public class Set_TreeSet_02 {

	public static void main(String[] args) {
		TreeSet<Integer> numTreeSet = new TreeSet<Integer>();
		numTreeSet.add(55);
		numTreeSet.add(25);
		numTreeSet.add(35);
		numTreeSet.add(5);
		numTreeSet.add(45);
		
		//Find the highest number which is lower than 25
		System.out.println(numTreeSet.lower(5));
		System.out.println(numTreeSet.lower(35));
		
		//Find the highest number which is lower than or equal to 25
		System.out.println(numTreeSet.floor(25));//25
		
		//Find the lowest number higher than 25
		System.out.println(numTreeSet.higher(25));
		
		//Find the lowest number higher than or equal to 44
		System.out.println(numTreeSet.ceiling(44));//45
		
	}

}
