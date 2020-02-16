package dockerproject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import bsh.Remote;

public class Zalenium_google {
	
	WebDriver driver;
	
	@Test
	public void zaleniumdemo() throws MalformedURLException, InterruptedException{
		
		System.out.println("test case is runing on Thread " + Thread.currentThread().getId());
		
		
		DesiredCapabilities desire= new DesiredCapabilities();
		desire.setBrowserName(BrowserType.CHROME);
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), desire);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("Rafa");
		driver.quit();
				
	}

}
