package expert;

public class ArraySorting {

	public static void main(String[] args) {
		int a[]= {2,5,3,6,5,9,8};
		
		for(int i=0;i<a.length;i++) {
			int temp;
			for(int j=i;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
