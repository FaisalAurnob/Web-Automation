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

	@Test(description = "Scenario: Add products to the shopping cart\n" + "Given: User is on the home page\n"
			+ "When: User hovers over 'Living'\n" + "And: User clicks 'Sofa'\n" + "And: User clicks 'Conrad Sofa'\n"
			+ "And: User scrolls down to 'Add to Cart'\n" + "And: User clicks 'PREDICTED DELIVERY TIME'\n"
			+ "And: User selects 'Dhaka' as the location\n" + "And: User selects 'Uttara' as the nearest showroom\n"
			+ "And: User selects 'PU Rexine' as the material\n" + "And: User selects 'Standard Size'\n"
			+ "And: User sets the quantity to '2'\n" + "Then: User clicks 'Add to Cart'\n"
			+ "And: User clicks 'View Cart'")
	public void testAddProductsToCart() throws InterruptedException {
		guestUser.FirstExecution();
	}

	@AfterMethod
	public void tearDownTest() {
		{
			driver.quit();
		}
	}
}