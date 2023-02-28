import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class staleelementrefexample {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("Vijay Kumar");
		driver.navigate().refresh();
		ele.sendKeys("Naveen AutomationLabs");
		
	}

}
