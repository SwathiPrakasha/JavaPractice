package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Cricketer implements Comparable<Cricketer> {
	int runs;
	String name;
	public Cricketer(String name, int runs) {
		super();
		this.name = name;
		this.runs = runs;
	}
	@Override
	public String toString() {
		return name + " " + runs;
	}
	@Override
	public int compareTo(Cricketer that) {
		if (this.runs > that.runs) {
			return 1;
		}
	if (this.runs < that.runs) {
		return -1;
	}
	return 0;
	}
}

	
public class List_ArrayList_SortComparable {
	public static void main(String[] args) {
		List<Cricketer> cricketers = new ArrayList<Cricketer>();
		cricketers.add(new Cricketer("Bradman", 9996));
		cricketers.add(new Cricketer("Sachin", 14000));
		cricketers.add(new Cricketer("Dravid", 12000));
		cricketers.add(new Cricketer("Ponting", 11000));
		System.out.println(cricketers);
		//[Bradman 9996, Sachin 14000, Dravid 12000, Ponting 11000]
		
		Collections.sort(cricketers);
		System.out.println(cricketers);
		//[Bradman 9996, Ponting 11000, Dravid 12000, Sachin 14000]
		

        Iterator it = cricketers.iterator();
        while(it.hasNext())
            System.out.print(it.next() + " "); 
	}
}
