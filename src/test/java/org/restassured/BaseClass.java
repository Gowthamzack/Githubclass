package org.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	
	RequestSpecification reqspec;
	Response response;
    public void addHeader(String key, String value) {	
    reqspec = RestAssured.given().header(key,value);
	} 
    
    public void addBody(String body) {
    reqspec= reqspec.body(body);	
	}
    
    public void addBasicAuth(String username, String password) {
    reqspec= reqspec.auth().preemptive().basic(username, password);	
	}
    
    public Response addReqType(String type, String endpoint) {
    switch (type) {
	case "GET":
		response = reqspec.get(endpoint);
		break;
	case "PUT":
		response = reqspec.put(endpoint);
		break;
	case "PATCH":
		response = reqspec.patch(endpoint);
		break;
	case "DELETE":
		response = reqspec.delete(endpoint);
		break;
	default:
		break;
		
	}
	return response;	
	}
    
    public int getResponseCode(Response response) {
    int statusCode = response.getStatusCode();
	return statusCode;
    
	}
    
    public String getReqBodyAsString(Response response) {
    String asString = response.asString();
	return asString;	
	}
    
    public String getReqBodyAsPrettyString(Response response) {
    String asPrettyString = response.asPrettyString();
	return asPrettyString;	
	}
    
    
	
}
