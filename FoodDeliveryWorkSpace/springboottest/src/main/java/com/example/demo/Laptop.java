package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	private int id;
	private String brenad;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrenad() {
		return brenad;
	}
	public void setBrenad(String brenad) {
		this.brenad = brenad;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", brenad=" + brenad + "]";
	}
	
	public void compiling() {
		System.out.println("laptop compiling....!");
	}
	
	
}
