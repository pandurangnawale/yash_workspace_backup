package expert;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StringPallimdrom {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String s1;
		System.out.println("Please Enter String : ");
		s1=sc.nextLine();
		
		Character x;
		Character z;
		boolean f=false;
		int a=0;int b=s1.length();
		int cnt=0;
		for(int i=0; i<s1.length()/2;i++) {
			x=s1.charAt(i);
			z=s1.charAt(b-1);
			b--;
			if(x.equals(z)) {
				 f=true;
				 System.out.println(cnt);
				 cnt++;
			}else {
				System.out.println("Not Palimdrom");
				System.exit(0);
			}
		}
		if(f) {
			System.out.println("Pallimdrom");
		}
		
	}
}
