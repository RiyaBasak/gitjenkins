package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenGit {
	
	WebDriver driver;
	@Test
	public void launchchrome () throws Exception
	{
		
		WebDriverManager.chromedriver().version("2.41").setup();
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(5000);
		System.out.println("Success");
		driver.quit();
		System.out.println("code is pushed");
		System.out.println("code is pushed again at 6.42 pm");
		System.out.println("code is pushed again at 6.59 pm");
		
		
		
	}

}
