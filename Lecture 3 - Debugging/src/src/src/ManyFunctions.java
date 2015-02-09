package src;

public class ManyFunctions {

	public static int foo() {
		int a = 3;
		return a + 1;
	}
	
	public static int bar() {
		int b = 4;
		
		return foo() + b; 
	}
	
	public static int baz() {
		int c = 12;
		return bar() + 12;
	}
	
	public static void main(String[] args) {
		baz();
	}

}
