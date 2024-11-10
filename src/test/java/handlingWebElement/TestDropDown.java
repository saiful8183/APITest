



                      //dropDown



package handlingWebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropDown {

	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.Edge.driver",
				
				"/Users/saiful/Downloads/edgedriver_mac64/msedgedriver");

		EdgeDriver driver=new EdgeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.get("https://gcreddy.com/project/create_account.php");	
		
		
		
		//Handling dropdown with 'select' class.It says give webelement
		
		Select dropDown=new Select(driver.findElement(By.name("country")));
		//here select is a class
		//here dropDown is variable
		
		
		dropDown.selectByVisibleText("Austria");//IHere 'Austria got selected
		
		
	List allOptions=dropDown.getOptions();//List is class
		
	System.out.println("Available options are:"+ allOptions.size());//Will return how many options 
	//are there
		
	   }

             }
