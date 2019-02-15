package Collection;
/*
 * Linked List are linear data structures where the elements are not stored in contiguous locations 
 * and every element is a separate object with a data part and address part.
 * The elements are linked using pointers and addresses. Each element is known as a node. 
 * Due to the dynamicity and ease of insertions and deletions, they are preferred over the arrays. 
 * It also has few disadvantages like the nodes cannot be accessed directly instead we need to start from the head 
 * and follow through the link to reach to a node we wish to access.

 * 
 */
import java.util.LinkedList;

//import java.util.List;

public class List_LLDemo {

	public static void main(String[] args) {
		LinkedList<String> object = new LinkedList<String>();
		
		object.add("A"); 
        object.add("B"); 
        object.addLast("C"); 
        object.addFirst("D"); 
        object.add(2, "E"); 
        object.add("F"); 
        object.add("G"); 
        System.out.println("Linked list : " + object);
        
        boolean status = object.contains("E"); 
 
        if(status) 
            System.out.println("List contains the element 'E' "); 
        else
            System.out.println("List doesn't contain the element 'E'"); 
        
        int size = object.size(); 
        System.out.println("Size of linked list = " + size); 
	}
}
