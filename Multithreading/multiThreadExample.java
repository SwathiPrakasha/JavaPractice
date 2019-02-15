package Multithreading;

class Hii extends Thread{
	public void run() {
		for(int i =0; i<5; i++) {
			System.out.println("Hi");
			try {Thread.sleep(500);} catch(Exception e) {}
	    }
	}
}
//Creating a thread using class Thread
class Helloo extends Thread{
	public void run() {
		for(int i =0; i<5; i++) {
			System.out.println("Hello");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}
}

//Creating a thread usig interface Runnable
class Helloo2 implements Runnable{
	public void run() {
		for(int i =0; i<5; i++) {
			System.out.println("Hello");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}	
}

public class multiThreadExample{
	public static void main(String[] args) {
		Hii obj3 = new Hii();
		//Helloo obj4 = new Helloo();
		
		//implementing the interface Runnable thread is little different 
		Helloo2 obj5 = new Helloo2();
		Thread newthread = new Thread(obj5);
		
		obj3.start();
		//obj4.start();
		newthread.start();
		
		//obj3.run();    Compiler error
		//obj4.run();    Compiler error
	}
	
}