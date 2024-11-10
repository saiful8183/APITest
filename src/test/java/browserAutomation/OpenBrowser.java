
//Open Chrome browser and open an URL


package browserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		//Setting up the browser driver and this is executable file
		//Driver executable file should match with current/latest  version.
		System.setProperty("webdriver.chrome.driver",//'System' is java class,'set property' is a method
		//method taking two argument one is string key another one is string  value.
			
				"//Users//saiful//Downloads//chromedriver-mac-arm64//chromedriver");
	  
		//Have to create an object for ChromeDriver class, creating an object of chromDriver class
		ChromeDriver driver=new ChromeDriver();
		//WebDriver driver = new ChromeDriver();//ChromeDriver-Data type,Driver-Variable,new ChromeDriver is object
		//Maximize the window
		driver.manage().window().maximize();//method chaining.How do we understand it is method ?
		//Answer is it is followed by Parenthesis ()
		
		//Opening an URL
		System.out.println("Opening an URL");
		driver.get("https://accounts.google.com/");//Fb,terget
		
		//driver.close();
	    //driver.quit();
	  
	    
	    //  we created object of chromeDriverclass.But  chromeDriverclass 
	    //actually implementing all this elements of Webdriver class.So webdriver is a super class and 
	    // chromeDriverclass implementing superClass.
	    
	    
	    
	
	}
	}
