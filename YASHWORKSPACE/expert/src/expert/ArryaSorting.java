package expert;

public class ArryaSorting {

	public static void main(String[] args) {
		
		int cur,chkCur;
		int arr[]= {0,3,2,0,4,0,9,0,7,0};
		for(int i=0;i<arr.length;i++) {
			chkCur=arr[i];
			for(int j=i;j<arr.length-1;j++) {
				if(chkCur<arr[j+1]) {
					cur=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=cur;
				}
			}
		}
		
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
		System.out.println();
	}
}