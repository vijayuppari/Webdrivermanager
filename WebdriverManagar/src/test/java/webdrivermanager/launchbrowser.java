package webdrivermanager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchbrowser {
	
	static WebDriver driver;
	@Test
	public void launhchromebrowser(){
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay\\workspace\\WebdriverManagar\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();*/
		WebDriverManager.chromedriver().version("70.0").setup();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}

}
