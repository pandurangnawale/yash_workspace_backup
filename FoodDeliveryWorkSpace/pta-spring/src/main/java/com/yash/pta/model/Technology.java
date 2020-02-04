package com.yash.pta.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity

public class Technology implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	@GeneratedValue
	int id;
	
	@Column(name="Name")
	String name;
	
	@JsonIgnore
	@OneToMany(cascade= CascadeType.ALL,mappedBy = "technology")
	Set<Questions> que;
	
	public Technology() {}
	
	public Technology(int id, String name, Set<Questions> que) {
		
		this.id = id;
		this.name = name;
		this.que = que;
	}
	
	@JsonIgnore
	public Set<Questions> getQue() {
		return que;
	}
	
	@JsonIgnore
	public void setQue(Set<Questions> que) {
		this.que = que;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", que=" + que + "]";
	}
	

}
