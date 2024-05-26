package org.write;

public class Address {

	private String district;
	private int pinCode;
	public Address(String district, int pinCode) {
		super();
		this.district = district;
		this.pinCode = pinCode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	
}
