package interviewQuestions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class findLatestWindow {

	WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumtraining\\DriverExes\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@Test
	public void getLatestWindow()
	{
		driver.get("https://www.cleartrip.com/flights");
		driver.findElement(By.linkText("Flight Deals")).click();
		Set<String> windowHandleString =  driver.getWindowHandles();
		
		System.out.println(windowHandleString);

		
		System.out.println(driver.getWindowHandle());
		
		String[] strname = (String[]) windowHandleString.toArray();
		String latestWindow = null;

	}
}
