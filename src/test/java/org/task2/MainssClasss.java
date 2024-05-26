package org.task2;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MainssClasss {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		File file=new File("C:\\Users\\kavit\\eclipse-workspace\\ApiTestingTask\\src\\test\\resources\\Employee.json");
		
		ObjectMapper mapper=new ObjectMapper();
		Root emp = mapper.readValue(file, Root.class);
		
		System.out.println(emp.getOrg());
		System.out.println(emp.getDest());
		System.out.println(emp.getDate());
		System.out.println(emp.getType());		
		System.out.println(emp.getPrice());
		
		Details details = emp.getDetails();
		System.out.println(details.getName());
		System.out.println(details.getPhoneNo());
		
		Address address = details.getAddress();
		System.out.println(address.getDistrict());
		System.out.println(address.getPinCode());
		
		
	}
	
}
