package testing1;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class xpath_using {

	@Test

	public void x() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://ng.cengage.com");

		driver.findElement(By.xpath("//a[contains(@class,'ceng-headerUtilityNav_itemButton js-signin')]")).click();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]")).sendKeys("princebhuiyan786@yahoo.com");
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("Amisunni1");
		driver.findElement(By.xpath("//*[contains(@value,'Sign In')]")).click();
		Thread.sleep(3000);
		//driver.findElements(By.xpath("//*[@id=\"ceng-header\"]/div[1]/div[2]/ul/li[3]"));
		Thread.sleep(3000);

		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebElement element= driver.findElement(By.xpath("//*[contains(@value,'Sign In')]")) ;
		// wait.until(Expectedconditoins.);
		driver.manage();
//		driver.close();
//		driver.quit();

	}
}
