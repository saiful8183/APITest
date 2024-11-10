package handlingWebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TestLinks {

	public static void main(String[] args) {

		//System.setProperty("webdriver.firefox.driver", "/Users/saiful/Desktop/Drivers/geckodriver");
		System.setProperty("Webdriver.edge.driver", "/Users/saiful/Desktop/Drivers/msedgedriver");

		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.navigate().to("https://www.google.com/");

		List<WebElement> Links = driver.findElements(By.tagName("a"));

		System.out.println("Total links are " + Links.size());

		for (int i = 0; i < Links.size(); i++) {
			
			System.out.print((i + 1) + " ");

			System.out.println(Links.get(i).getText());

			// System.out.println(Links.get(i).getAttribute("name"));
		}

		driver.quit();

	}

}
