package NaveenautoamtionLabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Singletonclasswebdriver {
	
	
	private static Singletonclasswebdriver instancedriver=null;
	private WebDriver driver;
	
	private Singletonclasswebdriver(){
		
	}
	
	public WebDriver opendriver(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay\\git\\Webdrivermanager\\WebdriverManagar\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public static synchronized Singletonclasswebdriver getdriverinstance(){
		if(instancedriver==null){
			instancedriver= new Singletonclasswebdriver();
		}
		return instancedriver;
	}

}
