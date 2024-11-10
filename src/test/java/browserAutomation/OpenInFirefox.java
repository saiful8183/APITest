package browserAutomation;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenInFirefox {

	public static void main(String[] args) {
	
		//Setting up the browser driver

		//System.setProperty("webdriver.gecko.driver",
				
				//"/Users/saiful/Downloads/geckodriver");
		  
		
		
		
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		//WebDriver driver=new ChromeDriver(co);
		
		 ChromeDriver driver=new ChromeDriver();
		
		
		  // System.setProperty("webdriver.Chrome.driver",
		
				//"/Users/saiful/Downloads/chromedriver_mac64/chromedriver");
		
		 //  System.setProperty("webdriver.Gecko.driver",
		
		//	"/Users/saiful/Downloads/geckodriver");
		   
		   
		  // System.setProperty("webdriver.Edge.driver",
					
					//"/Users/saiful/Downloads/msedgedriver");
			  
	  
		// creating an object of FirefoxDriver class
		   
		   
		   
		   
		
	//FirefoxDriver driver=new FirefoxDriver();
	
		// ChromeDriver driver=new ChromeDriver();
	
//	EdgeDriver driver=new EdgeDriver();
	
	
	
		//
	//Maximize the window
		driver.manage().window().maximize();//method chaining
		//Opening an URL
		driver.get("https://facebook.com/");//Fb,target
		
		//driver.close();
	    //driver.quit();
	  
	}

	
}
