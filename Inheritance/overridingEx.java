/*Overriding - Run time polymorphisum
 * Abstrct class cannot be instantiated 
 *@Override @Override annotation informs the compiler that the element is meant to override an element declared in a superclass.
 * Overriding methods will be discussed in Interfaces and Inheritance.
 * 
 *method hiding - When you define a static method in sub class same as parent, method hiding occurs. 
 *Actual method called will depend upon type of class and not in type of object as its the case in overriding.
 */

package Inheritance;

abstract class Animal{
	public String bark() {
		return "Dont Bark!";}
	
	static String test() {
		return "From Main";
	}
	
}

class cat extends Animal{
	@Override
	public String bark() {
		return "Meow Meow" ;
	}
	
	static String test() {
		return "From Cat";
	}
}

class dog extends Animal{
	public String bark() {
		return "Bow Bow";
	}
}


public class overridingEx{
	public static void main(String[] args) {
		//not overriding
		dog animal = new dog();
		
		//overriding 
		Animal animal2 = new cat();
		System.out.println(animal.bark());
		System.out.println(animal2.bark());
		System.out.println(animal2.test());   // object level
		System.out.println(cat.test());   	  // class level   - method hiding. - parent class and sub class having same static method 

	}
}
