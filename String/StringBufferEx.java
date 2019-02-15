package String;

class trial{
	public static void main(String[] args) {
		System.out.println("Hi,,,");
	}
}

class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("GeeksForGeeks");
		
		int len = str.length();
		int size = str.capacity();
		System.out.println("Length :"+len +" Capacity :"+size);
		
        StringBuffer s = new StringBuffer("Geeksfor"); 
        s.append("Geeks"); 
        System.out.println(s); // returns GeeksforGeeks 

        StringBuffer s1 = new StringBuffer("GeeksGeeks"); 
        s1.insert(5, "for"); 
        System.out.println(s1); // returns GeeksforGeeks 
        
        s.reverse(); 
        System.out.println(s);
	}
}
