package com.example.demo.beans;

public class Country {
	int id;
	String countryname;
	String contrycapital;
	
	
	
	
	public Country(int id, String countryname, String contrycapital) {
		
		this.id = id;
		this.countryname = countryname;
		this.contrycapital = contrycapital;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public String getContrycapital() {
		return contrycapital;
	}
	public void setContrycapital(String contrycapital) {
		this.contrycapital = contrycapital;
	}
	
	
}
