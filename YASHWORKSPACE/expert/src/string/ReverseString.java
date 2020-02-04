package string;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="pop";
		String temp="";
		for(int i=str.length()-1;i>=0;i--)
		{
			temp=temp+str.charAt(i);
		}
		System.out.println(temp);
		if(temp.equals(str))
		{
			System.out.println("palindro");
		}
	}

}
