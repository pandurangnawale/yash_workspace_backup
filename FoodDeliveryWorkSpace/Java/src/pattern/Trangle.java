package pattern;

import java.util.HashMap;
import java.util.Map;

public class Trangle {
	
	void drawTrangle(){
		 
		
		for(int i = 0; i<=3;i++) {
			
		
			for(int j = 0; j<=3;j++) {
				System.out.println(" ");			
			}			
			/*for(int i = 0; i<=3;i++) {
				System.out.println("*");			
			}
			for(int i = 0; i<=3;i++) {
				System.out.println("*");			
			}*/
		
		}
		
	}
	
	public static void main(String args[]) {
		Trangle tr = new Trangle();
		tr.drawTrangle();
		Map hm = new HashMap<Object,Object>();
		
	}

}
