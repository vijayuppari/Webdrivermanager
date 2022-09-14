package restAssured;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerilizationandDesirlization {
	
	public static void main(String[] args) throws JsonProcessingException {
		
		// Serilization
			// Java object to Bytestream (its nothing but jsonString)
		
		// Why serilization and Deserlization is required is, we are placing the in external files and databases
		// so its transfer over network or http. Thats why its required
		
		/*Employeepojo emppojo = new Employeepojo();
		
		emppojo.setEmpid(100);
		emppojo.setEmpname("Vijay Kumar");
		emppojo.setEmpsalary(50000);
		
		ObjectMapper objmapper = new ObjectMapper();
		
		String asString = objmapper.writerWithDefaultPrettyPrinter().writeValueAsString(emppojo);
		System.out.println(asString);*/
		
		
		// De -Serilization
		// Bytestream to Java object
		
		
		String jsonResponse= "{\"empid\":100,\"empname\":\"VijayKumar\",\"empsalary\":50000}";

		ObjectMapper objmapper = new ObjectMapper();
		Employeepojo employeeclass = objmapper.readValue(jsonResponse, Employeepojo.class);
		System.out.println(employeeclass.getEmpid() + " " + employeeclass.getEmpname()+ " " + employeeclass.getEmpsalary());
		
		// Its not always every time its required in the Form of class, we can store in Map as well.
		
		Map readValueasMap = objmapper.readValue(jsonResponse, Map.class);
		System.out.println(readValueasMap.get("empid") + " " + readValueasMap.get("empname") + " "+ readValueasMap.get("empsalary"));
		
		
		
		
	}
	
	
	
	
	

}
