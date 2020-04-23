package testing1;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class popup {

	@Test

	public void hundlepopup() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		
		driver.findElement(By.xpath("//form[@name='loginform']/descendant::input[@type='submit']"));
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		// driver.manage().deleteAllCookies();
		// driver.manage().window().maximize();

		// driver.close();
		// driver.quit();

	}
}
