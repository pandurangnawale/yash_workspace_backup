package expert;

public class HighestNumInArray {

	public static void removeDu()
	{
		int a[]= {1,2,2,3,4,5};
		int k=0;
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]!=a[i+1])
			{
				a[k]=a[i];
				k++;
			}				
		}
		a[k]=a[a.length-1];
		for (int i = 0; i<=k; i++) {
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		int a[]= {0,1,25,30,2,40,28,41,6,-1,-2,41};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++) {	
				if(a[i]>max)
					max=a[i];
				if(a[i]<min)
					min=a[i];
		}
		
	//	System.out.println("MAX : "+max +"\nMIN : "+min);
		removeDu();
	}

}
