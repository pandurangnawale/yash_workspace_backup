package test;

final class ImmutableDemo {
	
	final int a;
	final int b;
	private String d=null;
	private String c=null;
	
	public String getC() {
		return c;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	
	public String getD() {
		return d;
	}

	ImmutableDemo(int a,int b,String c,String d){
		this.a=a;
		this.b=b;
		this.c=c;	
		this.d=d;
	}
	
	@Override
	public String toString() {
		return "ImmutableDemo a=" + a + ", b=" + b + ", c=" + c + ",d=" +d;
	}

	public static void main(String[] args) {
		ImmutableDemo obj = new ImmutableDemo(10, 20, "Poonam","Pandurang");
		System.out.println(obj.toString());

	}
}
