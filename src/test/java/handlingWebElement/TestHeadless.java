

                  //Headless test\\




package handlingWebElement;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class TestHeadless {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.driver",
				
				"/Users/saiful/Downloads/geckodriver");
		
		WebDriver driver=new FirefoxDriver();
			
		  

// FirefoxOptions options=new FirefoxOptions();// (new chromeOptions) is object of the class'ChromeOptions'
	//options.setHeadless(false);//setHeadless is a method,it accept boolean values
	 //Can try with 'false'
		
	// WebDriver driver=new FirefoxDriver(options);
	 driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		
		driver.get("https:/www.amazon.com/");	
			
		    
		System.out.println(driver.getTitle());
		
		}

             }
