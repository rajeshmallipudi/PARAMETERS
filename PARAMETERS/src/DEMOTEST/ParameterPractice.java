package DEMOTEST;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterPractice {
	
	WebDriver driver;

	@Test
	@Parameters({"url"})
	public void yahoologin(String urll) {
		
		System.setProperty("webdriver.chrome.driver","D:\\LIBRARY\\chromedriver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get(urll);
		// driver.findElement(By.id("login-username")).sendKeys("rajesh@");
		System.out.println(urll); 
		driver.quit();
	}
	
	
	

}
