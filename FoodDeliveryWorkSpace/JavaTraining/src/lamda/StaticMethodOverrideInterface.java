package lamda;

interface StaticTest{
	
	void get();
	
	public static void testMethod(){
		 System.out.println("static method");
	}
	 
	
}


interface staticTest1 {//extends StaticTest{
	
	void get1();
	
	public static void testMethod1(){
		 System.out.println("static method over111");
	}
}

public class StaticMethodOverrideInterface implements staticTest1{

	public static void main(String[] args) {
		
		staticTest1 obj = ()->{
			//System.out.println();
		};
		
		//obj.testMethod();
		staticTest1.testMethod1();
	}
	
	@Override
	public void get1() {
		// TODO Auto-generated method stub
		
	}

}
