package testing1;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class frame {

	@Test

	public void hundleframe() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		Thread.sleep(2000);
		driver.switchTo().frame("packageListFrame");
		Thread.sleep(3000);
		
		new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("java.sql")));
		
		
		driver.findElement(By.linkText("java.applet")).click();

		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);

		Thread.sleep(2000);
		driver.findElement(By.linkText("Audioclip")).click();
		Thread.sleep(2000);

	}
}