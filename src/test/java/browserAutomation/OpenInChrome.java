package browserAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


   public class OpenInChrome {

	public static String browser= "firefox" ;//just change it to other browser and test it open or not
	public static WebDriver driver; //it is a global variable'object of Web driver class
	//Why it is web driver class? Answer is All this browsers drivers ,every driver 
	//implements with web driver class.webdriver is super class.
	
	
	public static void main(String[] args) {
	
		
		if(browser.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver","//Users//saiful//Downloads//chromedriver-mac-arm64");
			  
	    driver=new ChromeDriver();//Here no need to write Web driver before driver 
	                                         //because it is globally declared
			
				
	    }else if(browser.equals("firefox")) {
				
		System.setProperty("webdriver.gecko.driver" ,"/Users/saiful/Downloads/geckodriver");
		  
		 driver=new FirefoxDriver();//Here no need to write Web driver before driver 
		                                     //because it is globally declared
		
			
				
				
       }else if(browser.equals("edge")) {
    		
  	System.setProperty("webdriver.edge.driver","/Users/saiful/Downloads/edgedriver_mac64/msedgedriver");
  			
   driver=new EdgeDriver();//Here no need to write Web driver before driver 
  	                                   //because it is globally declared
	
				
  			
  			
         }else {
          System.out.println("Please set a correct browser");
         }
  			
  			
  			driver.manage().window().maximize();//method chaining
			
			driver.get("https://accounts.google.com/");//Fb,terget
				
				
				
				//driver.close();
			    //driver.quit();
			  
	}		

	}
