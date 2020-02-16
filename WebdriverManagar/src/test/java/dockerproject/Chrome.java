package dockerproject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Chrome {
	
	
	@Test
	public static void chrometest() throws InterruptedException, MalformedURLException{
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setBrowserName(BrowserType.CHROME);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4545/wd/hub"), cap);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("vijay");
		driver.findElement(By.id("pass")).sendKeys("nani");
		driver.quit();
		
	}

}
