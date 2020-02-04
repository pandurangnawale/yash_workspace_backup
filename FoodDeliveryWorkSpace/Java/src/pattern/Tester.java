package pattern;

public class Tester {

	
	public static void main(String[] args){
		
		try {
			System.out.println(" Placed a call for the same");			
			
			try {
				throw new NullPointerException();
			}catch (NullPointerException e) {
				System.out.println(" Executed Catc Inner");
				e.printStackTrace();
			}finally {
				System.out.println(" Executed inner finally ");
			}
			
		}catch (Exception e) {
			System.out.println(" Executed Catc outer");
			e.printStackTrace();
		}finally {
			System.out.println(" Executed here ");
		}
	}
}
