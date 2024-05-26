package org.write;

public class Details {

	private String name;
	private long phoneNo;
	private Address address;
	public Details(String name, long phoneNo, Address address) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
	
	
	
	
	
}
