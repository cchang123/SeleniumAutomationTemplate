package automated.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SmokeTest {
	
	String baseURL = "https://www.google.com";
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeSuite
	public void beforeSuite() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-features=VizDisplayCompositor");
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/v105/chromedriver.exe");
		driver = new ChromeDriver(options);
		wait = new WebDriverWait(driver, 60000);
	}
	
  @Test
  public void f() {
	  driver.get(baseURL);
  }
}
