package handlingWebElement;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LinksTest {

	
	
	
	
	WebDriver driver;

	@Parameters("browser")
	@BeforeTest	
    public void validateTitle(String brsr) {	//Here 'brsr' is variable
	
		
		
		
	if(brsr.equalsIgnoreCase("firefox")) {
	
	System.setProperty("webdriver.firefox.driver"," /Users/saiful/Desktop/Drivers/geckodriver");
	
    driver=new FirefoxDriver();
    
    
    
	
	}else if(brsr.equalsIgnoreCase("chrome")) {
    
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co);
		
		
}else if(brsr.equalsIgnoreCase("edge")) {
    
   System.setProperty("webdriver.edge.driver","/Users/saiful/Desktop/Drivers/msedgedriver");
	
    driver=new EdgeDriver();
	}
	}
	
@Test	
	public void testLinks() {
		
	//System.setProperty("webdriver.Edge.driver",
			
		//	"/Users/saiful/Downloads/edgedriver_mac64/msedgedriver");

	//EdgeDriver driver=new EdgeDriver();

	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.google.com/");
	// driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	driver.manage().window().maximize();

	/*
	 * List <WebElement> links = driver.findElements(By.tagName("a"));
	 * 
	 * System.out.println(links.size());
	 * 
	 * for (WebElement link : links) {
	 * 
	 * System.out.println(link.getText());
	 * 
	 * //System.out.println(link.getAttribute("href")); }
	 * 
	 */

	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println(links.size());

	for (int i = 0; i < links.size(); i++) {

		//System.out.print((i + 1) + " ");
		System.out.println(links.get(i).getText());

		// System.out.println(links.get(i).getAttribute("name"));

	}

	driver.quit();
	
	
	
	
}



}
	
		
		
		
		
	
