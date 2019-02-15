package Collection;
/*
 * The Java Stack class, java.util.Stack, is a classical stack data structure. 
 * You can push elements to the top of a Stack and pop them again, meaning read and 
 * remove the elements from the top of the stack.
 * 
 */
import java.util.Stack;

public class List_Stack {

	public static void main(String[] args) {
		Stack st = new Stack();
		st.push("first");
		st.push("second");
		st.push("third");
		st.push("fourth");

		System.out.println(st);
		
		//pop removes element from the end of the stack _ LIFO
		st.pop();
		System.out.println(st);
		
		//peek enables to see the top element of the stack 
		System.out.println(st.peek());
		
		//search look for the element from the top
		st.push("fourth");
		int index= st.search("second");
		System.out.println(index);
	}

}
