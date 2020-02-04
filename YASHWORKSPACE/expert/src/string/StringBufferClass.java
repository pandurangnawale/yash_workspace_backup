package string;

public class StringBufferClass {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("pandu");
		StringBuffer sb1 = new StringBuffer("pandu");
		
		System.out.println(sb==sb1); //false
		System.out.println(sb.equals(sb1));
		System.out.println(sb1);
		

	}

}
