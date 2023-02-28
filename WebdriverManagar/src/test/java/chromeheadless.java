import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chromeheadless {
	
	public static void main(String[] args) {
		
		
		ChromeOptions co= new ChromeOptions();
		co.setHeadless(true);
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://google.com");
		System.out.println("Url of the site is " + driver.getCurrentUrl());
		System.out.println("Title of the page is " + driver.getTitle());
		
		
	}

}
