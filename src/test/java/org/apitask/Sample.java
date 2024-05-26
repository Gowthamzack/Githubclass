package org.apitask;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sample {

	private static Object object2;

	public static void main(String[] args) throws IOException, ParseException {
		FileReader fileReader=new FileReader("C:\\Users\\kavit\\eclipse-workspace\\ApiTestingTask\\src\\test\\resources\\Employee.json");
		
		JSONParser jsonParser=new JSONParser();
		Object parse = jsonParser.parse(fileReader);
		
		JSONObject jsonObject=(JSONObject) parse;
		Object object = jsonObject.get("org");
		System.out.println(object);
		Object object3 = jsonObject.get("dest");
		System.out.println(object3);
		Object object4 = jsonObject.get("date");
		System.out.println(object4);
		Object object5 = jsonObject.get("type");
		System.out.println(object5);
		Object object6 = jsonObject.get("price");
		System.out.println(object6);
		
		Object object7 = jsonObject.get("details");
		JSONObject jsonObject2=(JSONObject) object7;
		
		Object object8 = jsonObject2.get("name");
		System.out.println(object8);
		Object object9 = jsonObject2.get("phone no");
		System.out.println(object9);
		
		Object object10 = jsonObject2.get("address");
		JSONObject jsonObject3=(JSONObject) object10;
		
		Object object11 = jsonObject3.get("dist");
		System.out.println(object11);
		Object object12 = jsonObject3.get("pin code");
		System.out.println(object12);
	}
	
}
