/*Overloading - A method having the same name as another method (in same class or a sub class) but having different
parameters is called an Overloaded Method.
 *
 */
package Inheritance;

class overloading{
	public static void main(String[] args) {
	 Bar obj =  new Bar();
	 obj.doIt(10, 15);
	 obj.doIt(10.2, 11.5);
	 
	}
	
}

class Foo {
	static void doIt(int num1, int num2) {
		int total = num1+ num2;
		System.out.printf("From 1st fun is %d\n", total); }
}

class Bar extends Foo{
	static void doIt(double num1, double num2) {
		double total= num1+num2;
		System.out.println(total);
	}
}