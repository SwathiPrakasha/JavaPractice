package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_arrayList_Sort {
	public static void main(String[] args) {
	List<String> numbers = new ArrayList<String>();
	numbers.add("one");
	numbers.add("two");
	numbers.add("three");
	numbers.add("four");
	System.out.println(numbers);//[one, two, three, four]
	
	//Strings - By Default - are sorted alphabetically
	Collections.sort(numbers);
	System.out.println("Sorted alphabatically using Collections.sort");
	System.out.println(numbers);//[four, one, three, two]
	}
}
