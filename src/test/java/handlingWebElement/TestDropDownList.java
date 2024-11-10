



package handlingWebElement;



import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestDropDownList {

	public static void main(String[] args) {
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "//Users/saiful/Downloads/chromedriver");
		 * 
		 * 
		 * 
		 * 
		 * //Creating an object of chrome driver class 
		 * WebDriver driver = new ChromeDriver(); 
		 * 
		 * //Maximize the window 
		 * driver.manage().window().maximize();//method chaining
		 * 
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 * 
		 * //Opening the URL driver.get("https://www.wikipedia.org/");
		 * 
		 */
		
		

		
		
		//To find out Elements of dropdown
		

		System.setProperty("webdriver.firefox.driver",
				
				"/Users/saiful/Downloads/geckodriver");
		  
		FirefoxDriver driver=new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.wikipedia.org/");
		
	
		
		             // It will show How many items only, like 71 and only one text  of that
		
						
						  List<WebElement> values=driver.findElements(By.tagName("option")); //Here'  webelement' is content // 'List' is a class ,have to import int
						  //int totalItems=values.size();
						 System.out.println("Total items  under the dropdown are:"+ values.size());
						 System.out.println (values.get(1).getText()); //'Get' is method to find text  and have to go through index with get method
						 
						 
						  
						  // Now we want to get all 71 .for that we have to use 'For loop'
						  
						  for(int i=0;i<values.size();i++) { // To get that link we use for loop to iterate //through the particular list. System.out.println
							  System.out.println  (values.get(i).getText());
						  
						 
		
		
		
	                //	To find out links\\ and have to delete one (}) under the page
					
					
					/*
					 * List<WebElement> value=driver.findElements(By.tagName("a"));
					 * 
					 * int totalItem=value.size();
					 * System.out.println("Total links under on the  page are:"+totalItem);
					 * 
					 */
	  }
	}
}



		
		
		
		
		
		
		
		
		
		
	


