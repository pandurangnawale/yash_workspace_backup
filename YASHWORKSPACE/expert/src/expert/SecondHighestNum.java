package expert;

public class SecondHighestNum {

	public static void main(String[] args) {
		int a[]= {0,1,25,30,2,40,28,41,6,-1,-2,41};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++) {	
				if(a[i]>max) {
					max=a[i];
				}					
				if(a[i]<min) {
					min=a[i];
				}
		}
		
		int secondMax=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<max && a[i]>secondMax) {
				secondMax=a[i];
			}
		}
		
		System.out.println(max +" Second Max  "+secondMax);

	}

}
