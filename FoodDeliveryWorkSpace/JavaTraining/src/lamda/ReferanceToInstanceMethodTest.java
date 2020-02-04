package lamda;

@FunctionalInterface
interface testInterface{
	
	void say();	
}

public class ReferanceToInstanceMethodTest {
	
	public void speek(){
		System.out.println("SPEEK METHOD");
	}

	public static void main(String[] args) {
		
		ReferanceToInstanceMethodTest obj = new ReferanceToInstanceMethodTest();
		
		testInterface t = obj::speek; //refering non static static method using method referance
		
		t.say();
		
		testInterface t2 = new ReferanceToInstanceMethodTest()::speek; 
		
		t2.say(); //interface methods
		
	}

}
