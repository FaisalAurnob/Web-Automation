package bd.com.akhtar.utils;

import java.io.ByteArrayInputStream;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.qameta.allure.Allure;

public class Utilities {

	public WebDriver driver;

	public Utilities(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}

	public void click(By locator) {
		findElement(locator).click();
	}

	public void sendKeys(By locator, String text) {
		findElement(locator).sendKeys(text);
	}

	public void hover(By locator) {
		Actions actions = new Actions(driver);
		WebElement element = findElement(locator);
		actions.moveToElement(element).perform();
	}

	public void scrollIntoView(By locator) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = findElement(locator);
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public void selectDropdownOption(By dropdownLocator, String optionText) {
		WebElement dropdown = findElement(dropdownLocator);
		dropdown.sendKeys(optionText);
	}

	public WebElement waitForElement(By locator, int timeoutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public void takeScreenshot(String name) {
		Allure.addAttachment(name,
				new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
	}
}
