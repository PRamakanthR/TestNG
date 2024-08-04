package basePage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class basePageOfApp {
	
	public WebDriver driver;
	WebDriverWait explicitWait;
	

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		explicitWait= new WebDriverWait(driver, Duration.ofSeconds(20000));

	}
	@Test
	public void launchApp() {	
//		driver.get("https://discoveryplus.com");
		System.out.println("Test1-Started");
		driver.navigate().to("https://discoveryplus.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		driver.findElement(By.xpath("//button[contains(@id,\"onetrust-accept-btn-handler\")]")).click();
//		Thread.sleep(2000);
//		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//a[contains(@aria-label,'Sign In')]")));
		System.out.println("Test1-completed");
	}
//	@Test
//	public void signInToApp() throws InterruptedException {
//		System.out.println("Test2-Started");
//		driver.findElement(By.xpath("//div//a[contains(@aria-label,'Sign In')]")).click();
//		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id,'content')]//h1[contains(text(),'Sign In')]")));
//		WebElement emailField=driver.findElement(By.id("email"));
//		System.out.println(emailField);
//		emailField.sendKeys("auto.hwa.prod2.gb.t7@disco.com");
//		WebElement passwordField=driver.findElement(By.id("password"));
//		passwordField.sendKeys("Hwateam123!");
//		WebElement signIn_CTA=driver.findElement(By.xpath("//button//span[contains(text(),'Sign In')]"));
//		Thread.sleep(2000);
//		signIn_CTA.click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
//		driver.findElement(By.xpath("//div//h1[contains(text(),\"Switch Profiles\")]"));
////		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//h1[contains(text(),\\\"Switch Profiles\\\")]")));
//	}

}


