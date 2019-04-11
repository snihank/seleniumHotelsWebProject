package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SharedSD {

	private static final String URL = "https://www.hotels.com/hotel-deals/?intlid=OTHER+%3A%3A+header_main_section";
//	private static final String URL = "https://groups.hotels.com/GroupForm.cfm?locale=en_US&intlid=HOME+%3A%3A+header_main_section&kw=header3";
	
	private static WebDriver driver = null;

	@Given("^I open the default browser and I am on hotel deals page$")
//	@Given("^I open the default browser and I am on Groups and Meetings page$")
	// @Before
	public static void before() {

		System.setProperty("webdriver.chrome.driver", "/Users/shakibkarim/Downloads/chromedriver");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Dimension d = new Dimension(1400, 900);
		driver.manage().window().setSize(d);
		driver.get(URL);

//		driver.findElement(By.linkText("Continue to Hotels.com")).click();

	}

	@Then("^I close the default browser$")
//	 @After
	public static void after() {
		if (driver != null) {
			driver.manage().deleteAllCookies();
			driver.quit();
		}
	}

	public static WebDriver getDriver() {
		return driver;
	}
}
