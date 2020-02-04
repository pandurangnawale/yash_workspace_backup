package expert;

import java.util.Scanner;

public class SIngleLoopSorting {
	static int temp;
	static int arrLength;
	
	static void arraySorting(int input[]) {
		arrLength=input.length;		
		int count=0;
		int sorted[]=new int[arrLength];
		for(int j=0;j<input.length-1;j++) {			
			if(input[j]!=0) {
				sorted[count]=input[j];
				count++;
			}else {
				
			}
		}
		System.out.println("SORTING");
		for(int k=0;k<sorted.length;k++) {
			System.out.print(" "+sorted[k]);
		}
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc  = new Scanner(System.in);
		int arrCapacity;
		System.out.println("How Many element you want to insert ");
		arrCapacity=sc.nextInt();
		int input[]=new int[arrCapacity];
		for (int i = 0; i < input.length; i++) {
			
		}
		System.out.println("Please Enter "+arrCapacity +" element ");
		for(int i=0;i<arrCapacity;i++) {
			input[i]=sc.nextInt();
		}
		SIngleLoopSorting.arraySorting(input);
		
	}

}
