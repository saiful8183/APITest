package browserAutomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TestBrowserValidationNavigation {

	public static void main(String[] args) throws InterruptedException {
		
		//For title and Url
		
System.setProperty("webdriver.gecko.driver",
		  "/Users/saiful/Downloads/geckodriver");

		

		//Creating an object of chrome driver class
        WebDriver driver=new  FirefoxDriver(); 
		//Maximize the window
		driver.manage().window().maximize();// method chaining

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		//Opening the URL
		
		driver.get("https://www.saucedemo.com/");
		
		
		
		String pageTitle=driver.getTitle();
		System.out.println("The title of the page is:"+pageTitle);
		
		String CurrentUrl=driver.getCurrentUrl();	
		System.out.println("The Url of the page is:"+CurrentUrl);
		
		Thread.sleep(1000);
		
		// Open another browser
		
		driver.get("https://demoqa.com/automation-practice-form");
		       
		Thread.sleep(1000);
		driver.get("https://www.google.com/");
	
		Thread.sleep(1000);
	driver.navigate().back();//one step back.This is called browser navigation
	
	driver.navigate().refresh();//would refresh the page
	
	driver.navigate().forward();//go one step forward
	
	//driver.close();
	//driver.quit();
	
	
                  }

         }
