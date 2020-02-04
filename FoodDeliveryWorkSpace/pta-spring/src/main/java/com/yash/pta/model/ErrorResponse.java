package com.yash.pta.model;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

public class ErrorResponse {
//    public ErrorResponse(String message, List<String> details) {
//        super();
//        this.message = message;
//        this.details = details;
//    }
 
	private int status;
	
    //General error message about nature of error
    private String message;
 
    //Specific errors in API request processing
    private List<String> errordetails;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getDetails() {
		return errordetails;
	}

	public void setDetails(List<String> errordetails) {
		this.errordetails = errordetails;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
 
    //Getter and setters
    
}
