package org.restassured;



import io.restassured.response.Response;

public class Request2 extends BaseClass {

	
	public void createFlight() {
	
		addHeader("content-type", "application/json");
		
		Response response2 = addReqType("POST", "https://omrbranch.com/api/flights");
		
		int responseCode = getResponseCode(response2);
		System.out.println(response2);
		
		String reqBodyAsPrettyString = getReqBodyAsPrettyString(response2);
		System.out.println(reqBodyAsPrettyString);
		
	}
}
