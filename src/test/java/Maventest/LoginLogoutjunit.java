package Maventest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginLogoutjunit {
	
WebDriver driver;
	@BeforeMethod
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\Selenium Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(" http://automationpractice.com/index.php");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Sign in")).click();
	

	}

	@Test
	public void test() throws InterruptedException {
	WebElement e1=driver.findElement(By.id("email"));
			e1.sendKeys("Red@hot.com");
			System.out.println(e1.getAttribute("value"));		
		driver.findElement(By.id("passwd")).sendKeys("red@hot.com");
		Thread.sleep(1000);
		driver.findElement(By.id("SubmitLogin")).click();
		driver.findElement(By.linkText("Sign out")).click();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void close() {
		
		driver.close();

}
}