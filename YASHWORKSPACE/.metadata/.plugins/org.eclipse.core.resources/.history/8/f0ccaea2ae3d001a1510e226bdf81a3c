package string;

import java.util.Arrays;
import java.util.HashMap;

public class StringAnagram {

	public static void main(String[] args) {
		
		String s1="abcdefg";
		String s2="agdcebf";
		
		Character ch1[]=new Character[s1.length()]; 
		Character ch2[]=new Character[s2.length()];
		
		for(int i =0;i<s1.length();i++) {
			ch1[i]=s1.charAt(i);
		}
		for(int i =0;i<s2.length();i++) {			
			ch2[i]=s2.charAt(i);
		}
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		
		Boolean flag=false;
		if(ch1.length!=ch2.length) {
			System.out.println("Not Annagram");
			System.exit(0);
		}else {
			for(int i=0;i<ch1.length-1;i++) {				
				if (ch1[i]!=ch2[i]) {
					flag=false;
				}else {
					flag=true;
				}
			}
		}
		
		if(flag) {
			System.out.println("Annagram");
		}else {
			System.out.println("Not Annagram");
		}
			
	}
	

}
