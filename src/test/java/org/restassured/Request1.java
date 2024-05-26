package org.restassured;


import io.restassured.response.Response;

public class Request1 extends BaseClass{

	
	public void listFlight() {
	addHeader("content-type", "application/json");
	
	Response response2 = addReqType("GET", "https://omrbranch.com/api/flights?page=1");
	
	int responseCode = getResponseCode(response2);
	System.out.println(response2);
	
	String reqBodyAsPrettyString = getReqBodyAsPrettyString(response2);
	System.out.println(reqBodyAsPrettyString);
		
	}
	
	private void method1() {
		System.out.println("1");
	}
	private void method2() {
		System.out.println("2");

	}
	
}
