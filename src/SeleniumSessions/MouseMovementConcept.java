package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.get("http://spicejet.com");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@id='highlight-addons']"))).build().perform();
		driver.findElement(By.partialLinkText("SpiceClub")).click();
		
		action.moveToElement(driver.findElement(By.xpath("//a[@id='ctl00_HyperLinkLogin']"))).build().perform();
		action.moveToElement(driver.findElement(By.partialLinkText("SpiceCash"))).build().perform();
		driver.findElement(By.linkText("Member Login")).click();

	}

}
