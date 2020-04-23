package testing1;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTesting {

	@Test

	public void BrowserTesting() {

		System.setProperty("webdriver.chrome.driver", "/driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");

		driver.findElement(By.id("search")).sendKeys("tum paas ayye");
		driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon")).click();
	//	driver.findElement(By.xpath("//[@id='hover-overlays']")).click();
		driver.findElement(By.linkText("Tum paas aaye-Kuch kuch hota hai ll Gokul K Madhu ll")).click();
	//	 implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.close();
		//driver.quit();

	}
}
