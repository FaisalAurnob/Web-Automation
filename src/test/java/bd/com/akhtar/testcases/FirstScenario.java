package bd.com.akhtar.testcases;

import bd.com.akhtar.base.Base;
import bd.com.akhtar.pages.GuestUser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstScenario extends Base {
	private WebDriver driver;
	private GuestUser guestUser;

	@BeforeMethod
	public void setUpTest() {
		System.out.println("Starting...");
		driver = initializeBrowserAndOpenApplicationURL("chrome");
		guestUser = new GuestUser(driver);
	}

	@Test(description = "Scenario: Add products to the shopping cart\n" +
			"Given: User is on the home page\n" +
			"When: User hovers over 'Living', clicks 'Sofa', clicks 'Conrad Sofa'\n" +
			"And: User scrolls down to 'Add to Cart' and clicks 'PREDICTED DELIVERY TIME'\n" +
			"And: User selects their location\n" +
			"And: User fills in data about product details\n" +
			"Then: User clicks 'Add to Cart'\n")
	public void testAddProductsToCart() throws InterruptedException {
		guestUser.FirstExecution();
	}

	@AfterMethod
	public void tearDownTest() {
		driver.quit();
	}
}
