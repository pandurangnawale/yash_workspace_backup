package expert;

public class ReverseArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,0};
		for (int i = a.length-1; i>=0; i--) {
			System.out.println(a[i]);
		}
		int n1=0;
		int n2=a.length-1;
		int temp;
		for(int i=0;i<a.length/2;i++) {
			temp=a[i];
			a[n1]=a[n2];
			a[n2]=temp;
			n1++;
			n2--;
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}

	}

}
