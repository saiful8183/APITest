package handlingWebElement;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTextErrorMessagePopUp {

	public static void main(String[] args) throws InterruptedException {
		

		
	
		
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//saiful//Downloads//chromedriver");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.get("https://gcreddy.com/project/login.php");	
		
		
		//coppyright linck//Capturing linck
		
WebElement footerText=driver.findElement(By.xpath("//*[@id=\"bodyWrapper\"]/div[6]/p"));
		System.out.println(footerText.getText());
		
		//For clicking login button
		
		
		  driver.findElement(By.xpath("//*[@id=\"tdb1\"]/span[2]")).click();
		  
		  
		  
		  //For error message//Capture error message
		  
     WebElement errorMessage =driver.findElement(By.className("messageStackError"));
		  
		 
		  
		  String message = errorMessage.getText();
		  
		  System.out.println("The error message is: " + message);
		
		  
	 //Navigating to new url to handle alert //From this website to another website
		  
		 
		  driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		 
		  //For login //Generating alart by clicking login button
		  
		  driver.findElement(By.name("proceed")).click();//Generataing alart by clicking 
		  //on login button
		  
		  //Process of handling the alart
		  // How to perform action on the atart and this way we can handle alart
		  
		  Thread.sleep(1000);
		  
		  Alert popup=driver.switchTo().alert();//switching the focus to alert
		  
		   System.out.println(popup.getText()); //Capturing alert message
		 
		   popup.accept();//accepting alert means click on'ok'
		  
		  Thread.sleep(1500);
		  
		  driver.quit();//closing the browser
		  
		  
		 
			  
		
	}

}
