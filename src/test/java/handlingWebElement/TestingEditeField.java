



                               // Validation of EditField\\

//Enter some value in editfield,again get input and validate and again clear the editfield.that is needed in editfield.
//Editfield has three capability.one is it should be Enabled,it should given ability to get some input ,at the same time ability to clearout the input.
//Able to write data,Should have capability to write data
//Able to get data and Script should be able to read the data and validate
//Able to clear the editfield



package handlingWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestingEditeField {

	public static void main(String[] args) throws InterruptedException {

		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		//WebDriver driver=new ChromeDriver(co);
		
		 ChromeDriver driver=new ChromeDriver();
		
		//System.setProperty("webdriver.chrome.driver","/Users/saiful/Downloads/chromedriver");


		//Opening the URL

		//Creating an object of chrome driver class
		//WebDriver  driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();// method chaining

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.gcreddy.com/project/admin/login.php");

	
	
		WebElement userName = driver.findElement(By.name("username"));
	boolean status=	userName.isDisplayed();                   //returns 'Element' is display or not
	System.out.println("The field is displayed:"+status);
	
	boolean condition=	userName.isEnabled();
	System.out.println("The field is enabled:"+condition);//returns 'Element' is enable or not
	
	
	String typeofInput=userName.getAttribute("type");
	
	System.out.println("The type field is :"+typeofInput);
	
	userName.sendKeys("I am Enabled");
	
	Thread.sleep(3000);
	//driver.quit();
	
	}

}
