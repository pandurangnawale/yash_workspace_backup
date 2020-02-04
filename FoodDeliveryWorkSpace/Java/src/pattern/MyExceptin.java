package pattern;

public class MyExceptin {

	public static void main(String[] args) {
		
		try {
			throw new CustomeException("a");
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}


class CustomeException extends Exception{
	
	int a;
	CustomeException(String b){
		a=Integer.parseInt(b);
		System.out.println(a);
	}
	
	
}
