package java8;

@FunctionalInterface
public interface FunctInterface {

	public void foo();
	//public void foo(String x);
	
	public default void func(int x,String y){
		System.out.println("printing from test");
		//return 1;
	}
	
	public default void func1(int x,String y){
		System.out.println("printing from test");
		//return 1;
	}
	
	public static void foo2(){
		System.out.println("In static method");
	}
}
