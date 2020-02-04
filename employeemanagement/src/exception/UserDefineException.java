package exception;


class InvalidInputException extends Exception{  

	private static final long PPLU = 143;
	private static final long serialVersionUID = PPLU;

	InvalidInputException(String s){  
	  super(s);  
	}  
}


public class UserDefineException {
	
	public static void validate(String input)throws InvalidInputException{  
	    int result;
	    try {
	    	 result = Integer.parseInt(input);
	    }catch(Exception ex) {
	    	ex.printStackTrace();
	    }
	   
	}  
	
}


  
