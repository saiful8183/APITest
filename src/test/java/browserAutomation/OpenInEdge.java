package browserAutomation;

import org.openqa.selenium.edge.EdgeDriver;

public class OpenInEdge {

	public static void main(String[] args) {
		
		//Setting up the browser driver
		
		
		
		System.setProperty("webdriver.edge.driver",
				
				"/Users/saiful/Desktop/driver/msedgedriver");
		  
			// creating an object of EdgeDriver class
			
			EdgeDriver driver=new 	EdgeDriver();
			//Maximize the window
			driver.manage().window().maximize();//method chaining
			//Opening an URL
			driver.get("https://accounts.google.com/");//Fb,terget

		     //driver.close();
		    //driver.quit();
		  }

}
