package profilePickerScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.By;
import org.testng.annotations.Test;
import basePage.basePageOfApp;
public class profileActions extends basePageOfApp {
	@Test
	public void AddProfile() {
		driver.findElement(By.xpath("//div[contains(@class,\"profile-picker-page__column\")]//a[contains(text(),\"Manage Profiles\")]")).click();
		By locator=By.xpath("//a[contains(@href,\"/gb/create-profile\")]//div[contains(text(),\"Add profile\")]");
		if(isElementExists(locator)) {
			driver.findElement(locator).click();
		}
	}
	
	public boolean isElementExists(By locator) {
		try {
			WebElement element =driver.findElement(locator);
			return element.isDisplayed();
		}
		catch(Exception e) {
			return false;
		}
		
	}
}


