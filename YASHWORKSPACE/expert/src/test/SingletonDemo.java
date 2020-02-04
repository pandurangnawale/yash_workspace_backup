package test;

public class SingletonDemo //implements Cloneable
{
	
	private SingletonDemo() {
		
	}	
	public static SingletonDemo obj;//= new SingletonDemo();	
	
	 public static SingletonDemo getInstance() {
		if(obj==null) {
			try {
				obj=new SingletonDemo();
			}catch (Exception e) {
				System.out.println(e);
			}			
			return obj;
		}
		return obj;		
	}
	
	public void run() {
		System.out.println("run");
	}
	
	public static void main(String args[]) //throws CloneNotSupportedException 
	{    
		SingletonDemo obj1 = SingletonDemo.getInstance();
		SingletonDemo obj2 = SingletonDemo.getInstance();		
		//SingletonDemo obj3=(SingletonDemo) obj1.clone(); // break singletone		
		System.out.println(obj1.hashCode() +"\n"+obj2.hashCode() );		
	}
}
