package testing1;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoverover {
	WebDriver driver;


	@Before
	public void open() {

		System.setProperty("webdriver.chrome.driver", "/driver/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test

	public void hoverover1() throws InterruptedException {

		driver.get("https://www.dell.com/en-us");
		Actions action = new Actions(driver);
		// String xpath ="";
//		By loctor = By.xpath("");
		WebElement element = driver.findElement(By.xpath("//button[@id='l1_4']"));
//		element.click();
		action.moveToElement(element).build().perform();

		WebElement emo = driver.findElement(By.linkText("Workstation Deals"));
		Thread.sleep(2000);
		emo.click();

	}
	
	@Test

	public void hoverover2() throws InterruptedException {


		driver.get("https://www.dell.com/en-us");
		Actions action = new Actions(driver);
		// String xpath ="";
//		By loctor = By.xpath("");
		WebElement element = driver.findElement(By.xpath("//button[@id='l1_4']"));
//		element.click();
		action.moveToElement(element).build().perform();

		WebElement emo = driver.findElement(By.linkText("Workstation Deals"));
		Thread.sleep(2000);
		emo.click();
	}

	@After
	public void close() {

		driver.close();
		driver.quit();

	}
}
