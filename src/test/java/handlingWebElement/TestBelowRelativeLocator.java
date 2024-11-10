package handlingWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator;

//If I do Static this one and Put dot(.)& put * at last before (;) 

//I have to remove Class(RelativeLocator)also at line 40.But if I do with non static 
//i have to put class name (RelativeLocator) at line 40 after findElement.

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class TestBelowRelativeLocator {

	public static void main(String[] args) {

		//System.setProperty("webdriver.firefox.driver", "\\Users\\saiful\\Downloads\\geckodriver\\ 3");
		System.setProperty("webdriver.firefox.driver", "/Users/saiful/Downloads/geckodriver");
//Opening the URL

		// Creating an object of chrome driver class
		FirefoxDriver driver = new FirefoxDriver();
		// Maximize the window
		driver.manage().window().maximize();// method chaining

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.saucedemo.com/");

		// Below
		// Desired/Destination to Password from username

		
		
		  WebElement below=driver.findElement(with(By.xpath("//input[@placeholder='Password']"))
		  .below(By.xpath("//input[@Placeholder='Username']")));
		  
		  below.sendKeys("1111");
		 
		  
		  
		  //Near
		  
			
			
			  WebElement near=driver.findElement(RelativeLocator
			  .with(By.xpath("//input[@placeholder='Password']"))
			  .near(By.xpath("//input[@Placeholder='Username']")));
			  
			  near.sendKeys("abc_123");
			 
		  
		  
		  // To Rightof
		  
		  
			
			
			  WebElement rightof=driver.findElement(RelativeLocator
			  .with(By.xpath("//input[@placeholder='Password']"))
			  .toRightOf(By.xpath("//input[@Placeholder='Username']")));
			  
			  rightof.sendKeys("abc_123");
			 
			 
		 
		  
		  
		  
		  // To Leftoff
		  
		  
			
			  WebElement leftof=driver.findElement(RelativeLocator
			  .with(By.xpath("//input[@placeholder='Password']"))
			  .toLeftOf(By.xpath("//input[@Placeholder='Username']")));
			  
			  leftof.sendKeys("abc_123");
			 
		  
		 

	}

}
