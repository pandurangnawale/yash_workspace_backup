package lamda;

@FunctionalInterface
interface PredicateTest{	
	boolean test();
}

public class CustomPredicate {
	
	static Boolean numberCheck(int num){
		if(num > 0){
			System.out.println("true");
		return true;
		}else {
			System.out.println("false");
			return false;
		}			
	}

	public static void main(String[] args) {
		
		PredicateTest obj = ()->CustomPredicate.numberCheck(10);		
		obj.test();
	}

}
