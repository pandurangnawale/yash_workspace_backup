package expert;

public class ArrayTestZeroLeft {

	public static void main(String[] args) {
		
		int arr[]= {1,0,2,0,5};
		
		int lnt=arr.length-1;
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println("i : "+i);
			if(arr[i]!=0) {
				arr[lnt]=arr[i];
				lnt--;
			}
		}
		
		for(int j=0;j<lnt;j++) {
			arr[j]=0;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
