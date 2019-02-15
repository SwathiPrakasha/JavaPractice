package Inheritance;

/*
Well, A java program can contain more than one “main” method in a class but, in the terms of Method Overloading.

The Standard MAIN method accepts the array of Strings as argument in java.

Method Overloading- The feature in java that allows more than one function of same name but different argument and return type.
 */
public class MainOverloading  {
		
	public static void main(int a){
		System.out.println("Overloaded Main with integer as argument");
	}
	
	public static void main(String a){
		System.out.println("Overloaded Main with String as argument");
	}

	public static void main(String[] args) {
		System.out.println("Called by JVM.. Default main()");
		main(1);
		main("Hello");
	}
}
