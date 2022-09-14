package JsonObjectMappr;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMappermain {
	
	
	// Convert Object to String - Serialization
public static void main1(String[] args) {
	
	try{
	ObjectMapper objectMapper = new ObjectMapper();
	Employee employee = new Employee(101,"Vijay","Application Enterprise","Software Engineer");
	objectMapper.writeValue(new File("target/sample.json"),employee);
	}
	catch (Exception e){
		e.printStackTrace();
	}
}

public static void main(String[] args) {
	
	
	try{
		
		ObjectMapper objectMapper = new ObjectMapper();
		String emloyee = "{\"empid\":101,\"empname\":\"Vijay\",\"project\":\"Application Enterprise\",\"designation\":\"Software Engineer\"}";
		Employee readValue = objectMapper.readValue(emloyee, Employee.class);
		System.out.println(readValue.getEmpname());
		
		/*JsonNode readTree = objectMapper.readTree(emloyee);
		String sproject = readTree.get("project").asText();
		System.out.println(sproject);*/
	}
	
	catch (Exception e){
		e.printStackTrace();
	}
	
	
}

}
