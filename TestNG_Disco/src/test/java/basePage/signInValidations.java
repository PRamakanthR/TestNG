package basePage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class signInValidations extends basePageOfApp{	
	@Test
	public void signInToApp() throws InterruptedException {
		System.out.println("Test2-Started");
		driver.findElement(By.xpath("//div//a[contains(@aria-label,'Sign In')]")).click();
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id,'content')]//h1[contains(text(),'Sign In')]")));
		WebElement emailField=driver.findElement(By.id("email"));
		System.out.println(emailField);
		emailField.sendKeys("hwa.samsungt8@test.com");
		WebElement passwordField=driver.findElement(By.id("password"));
		passwordField.sendKeys("Hwateam123!");
		WebElement signIn_CTA=driver.findElement(By.xpath("//button//span[contains(text(),'Sign In')]"));
		Thread.sleep(2000);
		signIn_CTA.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		driver.findElement(By.xpath("//div//h1[contains(text(),\"Switch Profiles\")]"));
//		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//h1[contains(text(),\\\"Switch Profiles\\\")]")));
	}

}
