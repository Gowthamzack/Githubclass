package org.write;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MainClass {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		File file=new File("C:\\Users\\kavit\\eclipse-workspace\\ApiTestingTask\\src\\test\\resources\\test1.json");
		ObjectMapper mapper=new ObjectMapper();
		
		Address address=new Address("Chennai", 600097);
		
		Details details=new Details("Gowtham", 748593748, address);
		
		Employee employee=new Employee("MAD", "IXM", "12-JAN-2024", "ONE-WAY", 12.45, details );
		mapper.writeValue(file, employee);
		
	}
	
}
