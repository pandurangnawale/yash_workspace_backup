package test;

public interface InterfaceDemo {
	void add();
}

class Child implements InterfaceDemo{

	@Override
	public void add() {
		System.out.println("ADD");
	}
}


class B extends Child{
	
	public static void main(String argsd[]) {
		B obj = new B();
		obj.add();
	}
	
}
