package basePage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class playback extends basePageOfApp{
	@Test
	public void playBack2() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div//h1[contains(text(),\"Switch Profiles\")]"));
	}
}
