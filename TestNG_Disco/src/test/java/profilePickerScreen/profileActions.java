package profilePickerScreen;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.By;
import org.testng.annotations.Test;
import basePage.signInValidations;
public class profileActions extends signInValidations{
	By DeleteProfileCTA=By.id("delete-pin-profile-button");
	WebDriverWait explicitWait=new WebDriverWait(driver, Duration.ofSeconds(20000));
	int n=4;
	
	@Test
	public void AddProfile() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//div[contains(@class,\"profile-picker-page__column\")]//a[contains(text(),\"Manage Profiles\")]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//button[contains(@aria-label,'Select profile')]")).click();
		if(isDeleteButtonExists(DeleteProfileCTA)) {
			driver.findElement(DeleteProfileCTA).click();
		}
		else {
			while(n>0) {
				By element = By.xpath("(//span//div//div[contains(@class,\"gwc-avatar-profile-picker-button__edit-icon\")])["+(n-1)+"]");
				driver.findElement(element).click();
//				Thread.sleep(4000);;;
				if(isDeleteButtonExists(DeleteProfileCTA)) {
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
					driver.findElement(DeleteProfileCTA).click();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
					driver.findElement(By.xpath("//div[contains(@class,'gwc-modal-cta-container__primary-button__sXf8C')]//span[contains(text(),\"Delete Profile\")][last()]")).click();
					break;
				}
				else {
					driver.navigate().back();
					Thread.sleep(4000);
				}
				n--;			}
		}
		
		WebElement AdProfile= driver.findElement(By.xpath("//div[contains(text(),'Add profile')]"));
		
		if(isElementExists(AdProfile)){
			AdProfile.click();
		}		
	}
	
	public boolean isElementExists(WebElement AddProfileLocator) {
		try {
			return AddProfileLocator.isDisplayed();
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
			driver.navigate().back();
			return false;
		}
	}
}


