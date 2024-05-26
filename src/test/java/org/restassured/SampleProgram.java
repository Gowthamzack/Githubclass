package org.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleProgram {

	public static void main(String[] args) {
		
		RequestSpecification reqspec;
		
		reqspec = RestAssured.given();
		reqspec= reqspec.header("content-type","application/json");
		Response response = reqspec.get("https://omrbranch.com/api/flight/22171");

		reqspec.body("{\r\n"
				+ "    \"data\": {\r\n"
				+ "        \"id\": 22175,\r\n"
				+ "        \"flightName\": \"AirIndia\",\r\n"
				+ "        \"Country\": \"India\",\r\n"
				+ "        \"Destinations\": \"87\",\r\n"
				+ "        \"URL\": \"https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India\",\r\n"
				+ "        \"Created_Date\": \"2024-01-09 10:52:54\",\r\n"
				+ "        \"Updated_Date\": \"2024-01-09 10:52:54\"\r\n"
				+ "    },\r\n"
				+ "    \"support\": {\r\n"
				+ "        \"url\": \"https:\\/\\/omrbranch.com\",\r\n"
				+ "        \"text\": \"For Joining Automation Course, Please Contact-Velmurugan 9944152058\"\r\n"
				+ "    }\r\n"
				+ "}");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		
		String asPrettyString = response.asPrettyString();
		System.out.println(asPrettyString);
		
		
	}
	
}
