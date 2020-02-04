package test;

public class ScopeClass {
	
	void localScope() {
		// we can use access specifier with local variable 
		// Local variable implemented at stack level
		// No default value for local variable 
		// we have to initialize local variable before use 
		int a; 
		//System.out.println(a);		
	}
	
	public int instanceVar;
	//Instance variable declared in inside class but outside method,constructor or block
	//Instance variable create when object is created using new keyword & Destroyed when obj is destroyed 
	//we can give access modifiers for instance variable
	//Instance variable visible for all methods in class
	//Instance variable have default value.
	//Instance Variable can access directly by calling the variable name in the class (inside class not in static main method)
	void instanceScope() {
		System.out.println("Printing Default value : "+instanceVar);
	}
	
	int c;
	static int d;
	static void staticScope() {
		//in static method access only static variable
		//by default it has its default value
		//it is initialize when program is start
		//static variable calling by its class name
		//System.out.println(c);
		System.out.println("static varible default : "+d);
	}

	public static void main(String[] args) {
		
		ScopeClass obj = new ScopeClass();
		obj.instanceScope();
		obj.staticScope();
	}

}
