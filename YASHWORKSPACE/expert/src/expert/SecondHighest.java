package expert;

public class SecondHighest {

	public static void main(String[] args) {
		int a[]= {45,25,30,40,28,41,42};
		
		int max =Integer.MIN_VALUE,secondMax=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			int num=a[i];int temp;
			if(num>max) {
				secondMax=max;
				max=a[i];
			}
			else if(a[i] > secondMax && a[i]!=max)
				secondMax=a[i];
		}
		
		System.out.println(max  +"   "+secondMax);

	}

}
