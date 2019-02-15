package String;

/* Different ways to create String*/
public class StringExample01 {
	public static void main(String[] args) {
	
	//String is immutable
	String str1 = "Hi";
	str1.concat("Hello");
	System.out.println(str1);
	
	//String by new 
	String str2 = new String("Welcome");
	System.out.println(str2);
	
	//string by StringBuffer
	StringBuffer  str3 = new StringBuffer("There");
	System.out.println(str3);
	
	//string by StringBuilder
	StringBuilder str4 = new StringBuilder("Have a good day!");
	System.out.println(str4);
	
	
	
	}
}
	
