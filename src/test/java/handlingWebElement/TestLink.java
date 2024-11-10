package handlingWebElement;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLink {

	public static void main(String[] args) {
		FirefoxDriver driver;
		// test a particular link

		System.setProperty("webdriver.firefox.driver", " /Users/saiful/Desktop/Drivers/geckodriver");

		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.get("https://www.google.com/");

		WebElement gmailLink = driver.findElement(By.linkText("Gmail"));

		boolean status = gmailLink.isDisplayed();
		System.out.println("Gmail link is displayed: " + status);

		status = gmailLink.isEnabled();// Checking enabled status
		System.out.println(("Gmail link is enabled:" + status));// Printing enabled status

		String linkName = gmailLink.getText();// Getting the the name of the link

		System.out.println("The link name is:" + linkName); // printing the name of the link

		gmailLink.click();// Clicking on the link being tested
		System.out.println("Title of the page is " + driver.getTitle());// Print the title of landing page

		System.out.println("Current Url is " + driver.getCurrentUrl());// Print the Url of landing page

		// driver.quit();
	}
}