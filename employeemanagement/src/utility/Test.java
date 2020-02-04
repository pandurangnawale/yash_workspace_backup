package utility;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean x=true;
		do {
			System.out.println("Input no ");
			int sw;
			
			sw=sc.nextInt();
			switch (sw) {
			case 1:
				System.out.println("1");
				break;
			case 2:	
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			default:
				break;
			}
		}while(x=false);
		

	}

}
