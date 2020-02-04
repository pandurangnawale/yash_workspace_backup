package lamda;

interface interface1{
	default void m1(){
		System.out.println("Defaault m1 of interface1");
	}
	
	void m2();
}

interface interface2{
	default void m1(int a){
		System.out.println("Defaault m1 of interface2");
	}
}

public class MultipleInheritance implements interface1,interface2 {
	

	public static void main(String[] args) {
		interface1 obj1 = new MultipleInheritance();
		obj1.m1();

	}

	@Override
	public void m2() {
		System.out.println("m2");
		
	}
}
