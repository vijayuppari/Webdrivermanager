package seleniumadvancedtpics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownquniquevalues {
	
	@Test
	public void dropdownoptions() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://geodata.solutions/");
		driver.manage().window().maximize();
		WebElement countries = driver.findElement(By.xpath("//select[@id='countryId']"));
		Select countrylist=  new Select(countries);
		List<WebElement> options = countrylist.getOptions();
		
		List<String> list= new ArrayList<String>();
		
		
		for (WebElement ele : options) {
			list.add(ele.getText());
		}
		list.remove(0);
		Set<String> hset = new HashSet<>(list);
		Assert.assertEquals(list.size(), hset.size());
		driver.quit();
		
	}

}
