package exceptionhandling;

public class SupperClass {
	
	void expChk()  {
		System.out.println("SUPPER ClASS \n");
	}

	public static void main(String[] args) {
		
		SupperClass sp = new SupperClass();
		sp.expChk();
		SupperClass sp1 = new ChildClass();
		sp1.expChk();
		
		// ChildClass ch = new SupperClass();  //we can not create superClass Object using ChildClass Reference
	}
}

class ChildClass extends SupperClass{
	
	//If in Parent Class does not throw any exception and if Child class throws Checked Exception then there is error. It gives error at run time.
	//if Parent class does not throws any exception and Child class throw UnChecked Exception then it will work fine
	void expChk() throws NullPointerException { 
		System.out.println("If in Parent Class does not throw any exception and if Child class throws Checked Exception then there is error. "
				+ "It gives error at run time.");
		System.out.println("if Parent class does not throws any exception and Child class throw UnChecked Exception then it will work fine \n");
	}
}
