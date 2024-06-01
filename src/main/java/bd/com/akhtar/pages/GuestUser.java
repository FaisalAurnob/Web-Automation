package bd.com.akhtar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import bd.com.akhtar.utils.Utilities;

public class GuestUser extends Utilities {

	public GuestUser(WebDriver driver) {
		super(driver);
	}

	static String baseUrl = "https://akhtar.com.bd";

	public By Living = By.xpath("//a[@class='d-flex align-items-center justify-content-center'][normalize-space()='Living']");
	public By Sofa = By.xpath("//h6[contains(text(),'Sofa')]");
	public By ConradSofa = By.xpath("//h4[contains(text(),'Conrad Sofa')]");
	public By PredictedDeliveryTime = By.xpath("//button[p[text()='PREDICTED DELIVERY TIME']]");
	public By Location = By.xpath("//select[contains(@class, 'form-select-lg') and @aria-label='.form-select-lg example']");
	public By Showroom = By.xpath("//div[@class='w-100 pt-4 desktop-desc']//div[@id='accordionFlushExample']//div[2]//select[1]");
	public By Material = By.xpath("//div[@class='col-12 col-lg-8 col-md-8 row']//div[1]//div[1]//select[1]");
	public By Size = By.xpath("//div[@class='col-12 col-lg-10 col-md-10']//div[2]//div[1]//select[1]");
	public By Qty = By.xpath("//input[@type='number']");
	public By AddToCart = By.xpath("//button[contains(text(),'ADD TO CART')]");
	public By CartIcon = By.xpath("//div[@class='upper-side-section cart-section desktop']//img");
	public By ViewCart = By.xpath("//div[@class='view-btn']");

	public void FirstExecution() throws InterruptedException {

		hover(Living);
		click(Sofa);
		click(ConradSofa);
		scrollIntoView(PredictedDeliveryTime);
		click(PredictedDeliveryTime);
		waitForElement(Location, 10);
		selectDropdownOption(Location, "Dhaka");
		scrollIntoView(Showroom);
		selectDropdownOption(Showroom, "Uttara");
		Thread.sleep(2000);
		scrollIntoView(Material);
		selectDropdownOption(Material, "PU Rexine");
		selectDropdownOption(Size, "Standard Size");
		sendKeys(Qty, "2");
		click(AddToCart);
		Thread.sleep(2000);
		scrollIntoView(CartIcon);
		Thread.sleep(2000);
		click(CartIcon);
		Thread.sleep(2000);
		click(ViewCart);
		takeScreenshot("ViewCartPage");
		Thread.sleep(2000);

	}
}
