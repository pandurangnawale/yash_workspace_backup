package pattern;

import java.util.Scanner;

public class LargestNumString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s1="";
		
		System.out.println("Enter the input ");
		s1=sc.nextLine();
		
		int s2=getLargestNum(s1);
		System.out.println(s2);

	}
	
	public static int getLargestNum(String input) {
		
		int num=0,res=0;
		
		for(int i=0;i<input.length();i++) {
			if(Character.isDigit(input.charAt(i))) {
				num = num * 10 + (input.charAt(i)-'0');
			}else {
				res = Math.max(res, num);
				num = 0;
			}			
		}		
		return Math.max(res, num);
	}	

}
