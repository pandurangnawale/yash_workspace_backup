package com.aop.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype") // it will create object of every new intance 
public class Alian {
	
	public Alian() {
		System.out.println("Object created ");
		
	}
	
	private int aId;
	private String aName;
	private String aTechnology;
	@Autowired
	private Laptop laptop;
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getaTechnology() {
		return aTechnology;
	}
	public void setaTechnology(String aTechnology) {
		this.aTechnology = aTechnology;
	}
	
	public void show() {
		System.out.println("In Alian");
		laptop.compile();
	}
	
	

}
