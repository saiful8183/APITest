

                  // Testing Column and rows\\
                 



package handlingWebElement;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class TestWebTable {

	public static void main(String[] args) {
	
		
		
		

		System.setProperty("webdriver.gecko.driver", "/Users/saiful/Downloads/geckodriver");
		
		
		WebDriver driver=new FirefoxDriver();
		

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		
		driver.get("https://www.timeanddate.com/worldclock/?continent=namerica");	
		          
		
		
		
		          //find out row
		
		
		         // xpath of table and rows
		
		  //     //table[@class='zebra fw tb-theme']  (Xpath of table)
		
		 //     //table[@class='zebra fw tb-theme']/tbody/tr  (xpath of rows)
		 
		  
		
		// /html/body/div[5]/section[1]/div/section/div[1]/div
		  
		                 
		              //find out row
		  
List<WebElement>rows=driver.findElements(By.xpath       //List is a class,webElement is DataType
		("//table[@class='zebra fw tb-theme']/tbody/tr"));//This is giving us list of all the rows 
		//and all rows are WebElements  
		  int totalRows=rows.size();  // Return Row size
		  
		  System.out.println("Total Rows in this table is: " + totalRows);
		
		  
		  
		              
		  
		  
		  
		  
		  
		  
		  
		  
		                    //Find out column
		           
		                     //Xpath of column
		
		  //      //table[@class='zebra fw tb-theme']/tbody/tr [1]/td    (Xpath for column)
		  
		  
		  
		  List<WebElement>columns=driver.findElements(By.
		  xpath("//table[@class='zebra fw tb-theme']/tbody/tr[1]/td"));
		  
		  int totalColumns=columns.size();
		  System.out.println("Total columns in this table is: " +totalColumns);
		  
		 
		  
		  
		  
		  
		  for(int i=1;i<=totalRows;i++) { 
			  
			  for(int j=1;j<=totalColumns;j++) {
       String value=driver.findElement(By.
		  xpath("//table[@class='zebra fw tb-theme']/tbody/tr[\\\"+i+\\\"]/td[\\\"+j+\\\"]")).getText();
			  System.out.println(value + " ");
		  
		  }
		  
		  System.out.println(); 
		  System.out.println("=========="); 
		  
		
		  }
	
	  System.out.println("North Amarica Time is captured");
	
	}
}
