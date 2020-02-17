package DEMOTEST;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Worstdemo {
	WebDriver driver;
	@Test
	@Parameters({"urll"})
	public void twitterlogin(String raja) {
		
		System.setProperty("webdriver.chrome.driver","D:\\LIBRARY\\chromedriver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get(raja);
			driver.findElement(By.xpath("//*[@id=\"page-container\"]/div/div[1]/form/fieldset/div[1]/input")).sendKeys("naveen");
			driver.quit();
}
}