package lamda;

@FunctionalInterface
interface MyPredicate{
	boolean test(int n);
}

class evenOddTest{
	public static boolean isEven(int n){
		return n%2==0;
	}
}

public class MethodReferanceDemo {	

	public static void main(String[] args) {
		
		MyPredicate predicateObj = (n) -> false;
		System.out.println(predicateObj.test(25));
		
		//USING LAMDA===============================
		
		MyPredicate predicate1 = (n) -> evenOddTest.isEven(n);
		System.out.println(predicate1.test(20));
		
		//USING METHOD RFERANCE=======================
		MyPredicate prwedicate2 =  evenOddTest::isEven;
		System.out.println(prwedicate2.test(27));

	}

}
