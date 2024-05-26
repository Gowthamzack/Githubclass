package org.write;

public class Employee {

	private String org;
	private String dest;
	private String date;
	private String type;
	private double price;
	private Details details;
	
	
	public Details getDetails() {
		return details;
	}
	public void setDetails(Details details) {
		this.details = details;
	}
	
	
	public Employee(String org, String dest, String date, String type, double price, Details details) {
		super();
		this.org = org;
		this.dest = dest;
		this.date = date;
		this.type = type;
		this.price = price;
		this.details = details;
	}
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
