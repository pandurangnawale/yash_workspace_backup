package expert;

import java.util.HashMap;
import java.util.Map;
public class TotalNumberOccurance {

	public static void main(String[] args) {
		
		int a[]= {1,2,2,3,3,3,4,4,4,4};
		Map<Object, Object> hm = new HashMap<>();
		for(int i=0;i<a.length;i++) {
			int cnt=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j] ) {
					cnt++;
					hm.put(a[i], cnt);
				}
			}
		}
		System.out.println(hm);
	}
}
