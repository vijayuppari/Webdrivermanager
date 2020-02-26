package Webservice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Restassured1 {
	
	@Test
	public void getresponse(){
		
		int statuscode =get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		Assert.assertEquals(statuscode, 200);
		System.out.println("Json response showing properly");
	}

}
