package Webservice;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

import java.util.List;
import java.util.Map;

public class Restassured1 {
	
	@Test
	public void getresponse(){
		
		int statuscode =get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		Assert.assertEquals(statuscode, 200);
		System.out.println("Json response showing properly");
		
		RestAssured.get("").then().body("", Matchers.instanceOf(Map.class));
		RestAssured.get("").then().body("", Matchers.instanceOf(List.class));
		
		
		// Seriliation
		//-- Object to Bytestream to store data in external files like database and text files over network
		// -- vice versa for desrilization .. coverting bytestrea to object
		
		// In similar manner coverting POJO (that is Java object) to Json serlizatin and Json to POJO is desrilization 
		// Uisng Jackson dependecy we cn achive  this and Objectapper
	}

}
