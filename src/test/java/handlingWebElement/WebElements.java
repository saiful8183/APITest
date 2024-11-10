
  package handlingWebElement;
  
  import java.util.NoSuchElementException;
  
  import org.openqa.selenium.By; 
  import org.openqa.selenium.WebDriver; 
  import org.openqa.selenium.WebElement;
  import java.time.Duration; 
  import org.openqa.selenium.By; 
  import org.openqa.selenium.WebElement; 
  import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
// import org.openqa.selenium.support.ui.ExpectedConditions
  import org.openqa.selenium.support.ui.FluentWait; 
  import org.openqa.selenium.support.ui.Wait; 
  import org.openqa.selenium.support.ui.Select; 
  import org.openqa.selenium.support.ui.WebDriverWait;
  
  public class WebElements {
  
  public static void main(String[] args) {
  
 // Should be small letter. //
 // chrome is browser name,driver is keyword
  
  
  System.setProperty("webdriver.gecko.driver",
		  "/Users/saiful/Downloads/geckodriver");
  FirefoxDriver driver = new FirefoxDriver();
  
  driver.manage().window().maximize();// method chaining
  
  // implicit wait-\\
  
  // works implicitly on all the web Elements on a particular screen // do it
 // once and it is applicable for all the elements.Don't have to repeat // them
  
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  
  // Opening facebook
  
  
  driver.get("https://www.facebook.com/signup");// Fb,terget
  
  WebElement emailPhone = driver.findElement(By.name("firstname"));// Driver is
  //reference variable //By is class
  
  emailPhone.sendKeys("saiful");
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  
  
  WebElement email = driver.findElement(By.name("lastname"));
  email.sendKeys("Chowdhury");
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  
  
  WebElement e = driver.findElement(By.name("reg_email__"));
  e.sendKeys("3472386233");
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  
  WebElement em=driver.findElement(By.id("password_step_input"));
  em.sendKeys("Chowdhury");
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  
  
  WebElement webel=driver.findElement(By.className("_58mt")); webel.click();
  
  
  
  Select selectBirth =new Select(driver.findElement(By.className("mtm mbs _2_68")));
  selectBirth.getFirstSelectedOption(); //selectByVisibleText("September");
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  
  
  
  
  
  
  WebElement m=driver.findElement(By.id("month")); //m.sendKeys("september");
  
  
  Select selectMonth =new Select(driver.findElement(By.id("month")));
  selectMonth.selectByValue("Sep"); //selectByVisibleText("September");
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  
  
  
  
   WebElement mw=driver.findElement(By.id("day")); // mw.sendKeys("First");
  
  
  Select selectDate =new Select(driver.findElement(By.id("day")));
  selectDate.selectByVisibleText("20");
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  
  
  
  Select selectYear =new Select(driver.findElement(By.id("birthday_year")));
  selectYear.selectByVisibleText("1983");
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  
  
  WebElement web=driver.findElement(By.name("birthday_year"));
  web.sendKeys("1983");
  
  
  Select sel3 =new
  Select(driver.findElement(By.xpath("//*[@id=\"year\"]/option[40]"))); 
  sel3.selectByIndex(1983); //selectByVisibleText("1983");
  
  
	/*
	 * // opening gmail
	 * 
	 * driver.get("https://accounts.google.com");//open google WebElement
	 * emailPhone=driver.findElement(By.id("identifierId"));
	 * emailPhone.sendKeys("saifislam8183@gmail.com");//For typing element ues
	 * //'sendkeys'
	 * 
	 * // make it in one line //
	 * driver.findElement(By.id("identifierId")).sendKeys("saifislam8183@hmail.com")
	 * ;
	 * 
	 * driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).
	 * click();
	 * 
	 * // For showing error massage(if put invalid email)
	 * 
	 * 
	 * WebElement errorMessage= driver.findElement(By.xpath(
	 * "//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div[1]/" +
	 * "div/form/span/section/div/div/div[1]/div/div[2]/div[2]/div/text() "));
	 * 
	 * System.out.println( errorMessage.getText());//print command // 'Gettext' is a
	 * // method
	 * 
	 * 
	 * 
	 * 
	 * // Explicit wait\\ Works on a specific web element for a specific purpose
	 * 
	 * 
	 * WebDriverWait wait=new
	 * WebDriverWait(driver,Duration.ofSeconds(10));//webdriverwait is a class
	 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
	 * "//*[@id=\"identifierNext\"]/div/button/span"))).click();
	 * 
	 * driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).
	 * click();
	 * 
	 * 
	 * // fluent Wait\\
	 * 
	 * Wait<WebDriver>wait1= new FluentWait< WebDriver>(driver)//wait is a class
	 * .withTimeout(Duration.ofSeconds(30)) .pollingEvery(Duration.ofSeconds(5))
	 * .withMessage("Time out as the element was not found")
	 * .ignoring(NoSuchElementException.class);
	 * wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(
	 * "//*[@id=\"identifierNext\"]/div/button/span"))).click();
	 */
  } }
 
















