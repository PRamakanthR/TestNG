package profilePickerScreen;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
//import org.openqa.selenium.By;
import org.testng.annotations.Test;
import basePage.signInValidations;
public class profileActions extends signInValidations{
	By AddProfileLocator=By.xpath("//a[contains(@href,\"/gb/create-profile\")]//div[contains(text(),\"Add profile\")]");
	By DeleteProfileCTA=By.id("delete-pin-profile-button");
	WebDriverWait explicitWait=new WebDriverWait(driver, Duration.ofSeconds(20000));
	int n=4;
	@Test
	public void AddProfile() {
//		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("\"//div[contains(@class,\\\"profile-picker-page__column\\\")]//a[contains(text(),\\\"Manage Profiles\\\")]\"")));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		driver.findElement(By.xpath("//div[contains(@class,\"profile-picker-page__column\")]//a[contains(text(),\"Manage Profiles\")]")).click();
		System.out.println("Brain is not braining");
		if(isElementExists(AddProfileLocator)) {
			driver.findElement(AddProfileLocator).click();
		}
			System.out.println("Brain is not braining2");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
			driver.findElement(By.xpath("//span//div//div[contains(@class,\"gwc-avatar-profile-picker-button__edit-icon\")]")).click();
			if(isDeleteButtonExists(DeleteProfileCTA)) {
				driver.findElement(DeleteProfileCTA).click();
			}
			else {
				while(n>0) {
					driver.navigate().back();
				}
			}
		
	}
	
	public boolean isElementExists(By AddProfileLocator) {
		try {
			WebElement element =driver.findElement(AddProfileLocator);
			return element.isDisplayed();
		}
		catch(Exception e) {
			return false;
		}
		
	}
	public boolean isDeleteButtonExists(By DeleteProfileCTA) {
		try {
			WebElement element =driver.findElement(DeleteProfileCTA);
			return element.isDisplayed();
		}
		catch(Exception e) {
			return false;
		}
	}
}


//package profilePickerScreen;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
////import org.openqa.selenium.By;
//import org.testng.annotations.Test;
//import basePage.signInValidations;
//public class profileActions extends signInValidations{
//	By AddProfileLocator=By.xpath("//a[contains(@href,\"/gb/create-profile\")]//div[contains(text(),\"Add profile\")]");
//	By DeleteProfileCTA=By.id("delete-pin-profile-button");
//	int n=5;
//	@Test
//	public void AddProfile() throws InterruptedException {
//		driver.findElement(By.xpath("//div[contains(@class,\"profile-picker-page__column\")]//a[contains(text(),\"Manage Profiles\")]")).click();
//		System.out.println("Brain is not braining");
//		if(isElementExists(AddProfileLocator)) {
//			driver.findElement(AddProfileLocator).click();
//		}
//		else {
////			driver.findElement(By.xpath("(//div[contains(@class,\"gwc-avatar-profile-picker-button__edit-icon\")])[last()]")).click();;
//			
//				while(n>0) {
//					
//					By element = By.xpath("(//span//div//div[contains(@class,\"gwc-avatar-profile-picker-button__edit-icon\")])["+(n-1)+"]");
//					driver.findElement(element).click();
//					Thread.sleep(4000);
//					if(isDeleteButtonExists(DeleteProfileCTA)) {
//						driver.findElement(DeleteProfileCTA).click();
//						break;
//					}
//					else {
//						driver.navigate().back();
//						Thread.sleep(4000);
//					}
//					n--;
//				}
//			
//		}
//	}
//	
//	public boolean isElementExists(By AddProfileLocator) {
//		try {
//			WebElement element =driver.findElement(AddProfileLocator);
//			return element.isDisplayed();
//		}
//		catch(Exception e) {
//			return false;
//		}
//		
//	}
//	public boolean isDeleteButtonExists(By DeleteProfileCTA) {
//		try {
//			WebElement element =driver.findElement(DeleteProfileCTA);
//			return element.isDisplayed();
//		}
//		catch(Exception e) {
//			return false;
//		}
//	}
//}





