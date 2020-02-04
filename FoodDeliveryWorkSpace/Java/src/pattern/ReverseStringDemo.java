package pattern;

import java.util.Scanner;

public class ReverseStringDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input="";
		System.out.println("Enter The String  ");
		input=sc.nextLine();
		String result=reverse(input);
		System.out.println(result);

	}
	
	public static String reverse(String input) {		
		String output="";
		String worldSplit[]=input.split(" ");
		
		for(int i=worldSplit.length-1;i>=0;i--) {
			output= output + worldSplit[i]+" ";
		}		
		return output;
	}

}
