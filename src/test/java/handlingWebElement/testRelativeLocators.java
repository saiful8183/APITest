



            



package handlingWebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;

import java.time.Duration;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class testRelativeLocators {

	public static void main(String[] args) {  
		
		
 //Starting up the browser driver
// Should be small letter.
// chrome is browser name,driver is keyword

System.setProperty("webdriver.chrome.driver",
		
		"//Users/saiful/Downloads/chromedriver");


//Opening the URL

//Creating an object of chrome driver class
WebDriver driver = new ChromeDriver();
//Maximize the window
driver.manage().window().maximize();// method chaining

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

driver.get("https://demoqa.com/automation-practice-form");
		
	
 //Relative locators 'above'
 
 //driver.findElement()
 
 
 
                           

                                       //above
                                   //  Below to up\\
                                 //driver.findElement(By.id("dateOfBirthInput")));
								



								  WebElement above=driver.findElement(RelativeLocator.with(By.xpath(
								  "//*[@id=\"userNumber\"]")) .above(By.id("dateOfBirthInput")));
								  
								  above.sendKeys("+13472386233");
								 						  
								  
								 
							         	// This portion is InComplete
 
                       
								              //Below
								              // up to Below //
							
							  WebElement below= driver.findElement(RelativeLocator
							  .with(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]"))
							  .below(By.id("dateOfBirthInput")));
							 
								
								  Wait<WebDriver>wait= new FluentWait< WebDriver>(driver)//wait is a class
								  .withTimeout(Duration.ofSeconds(30)) 
								  .pollingEvery(Duration.ofSeconds(5))
								  
								  .ignoring(ElementNotInteractableException.class);
								  
								  wait.until(ExpectedConditions.elementToBeClickable(below)).
								  sendKeys("below");
								 
 }

}
	
		
		
		
		
		
		
		
		
		
	