package String;
public class Test{
static int num=0;
public Test() {
	System.out.println(num+"--from outer constructor");
}

public static void main(String args[]){
	System.out.println("In the first main");
	Test t = new Test();
	Inner i=new Inner();
}

public static class Inner{
	public Inner(){
		System.out.println(num+"--from inner constructor");
}
	public static void main(String args[]){
		System.out.println("In the second main");
	}
}
}