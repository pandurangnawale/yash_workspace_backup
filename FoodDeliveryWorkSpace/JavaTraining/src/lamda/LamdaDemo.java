package lamda;

import java.awt.CardLayout;

interface Msg{	
	public String greet();
}

interface Msg1{
	public String greet(String msg,String msg1);	
}

interface calculate{
	public int add(int a,int b);
}

interface personalInfo{
	public String personaleData(String fname,String lname);
}


interface java8InterfaceTest{
	default void defaultMethod(){
		System.out.println("Interface Default Method Implimentation");
	}
}

@FunctionalInterface
interface funcInterface{
	public void functionaalMethod(); //by default its abstract method
	
	default void defaultMethod(){
		System.out.println("Functional Interface Default MEthod");
	}
}

public class LamdaDemo {

	public static void main(String[] args) {
		
		funcInterface funObj=()->{
			
			System.out.println("Functional Interface");
		};
		funObj.functionaalMethod();
		funObj.defaultMethod();
		
		String s1= "Welcome to java8";
		Msg obj = new Msg(){
			public String greet(){
				return s1;
			}
		};
		String abc=obj.greet();
		System.out.println(abc);
		
		//====================================USING LAMDA============================
		
		String msg1="Welcome to java8 Lamda";		
		Msg m=()-> "without curly"; //without curly
		//{
			//return msg1;
		//};
		String mg = m.greet();
		System.out.println(mg);
	
		//====================================USING LAMDA WITH PARAMETER==============
		
		String nameMsg="Datta";
		String nameMsg1="Patil";
		Msg1 m1=(name,name2)->{
			return "Hello "+ name +" "+nameMsg1;
		};
		String msg1Response=m1.greet(nameMsg,nameMsg1);
		System.out.println(msg1Response);
		
		
		//===============================USING LAMDA WITH TYPE PARAMETER==============
		calculate addObj=(int a,int b)->{
			return (a+b);
		};
		int addition=addObj.add(2,5);
		System.out.println(addition);
		
		calculate calObj =(a,b)->(a+b); //without return and curly
		int calResponse=calObj.add(5, 6);
		System.out.println(calResponse);
		
		//===========================LAMDA CUSTOMISATION======================================
		
		personalInfo obj1 = (fname,lname)->{
			String fname1="Pandurang";
			String lname1="Nawale";
			return fname1 + " "+lname1;
		};
		String fname="ABCD";
		String lname="PQRS";
		String personalResponse=obj1.personaleData(fname, lname);
		System.out.println(personalResponse);
		
		
	} //main
	

}
