package expert;

public class Temp1 {

	public static void main(String[] args) {
		int arr[]= {1,0,2,0,5};
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[k]=arr[i];
				k++;
			}
			
		}
		for(int i=k;i<arr.length;i++)
		{
			arr[i]=0;
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
