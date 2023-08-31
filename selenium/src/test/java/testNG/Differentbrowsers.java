package testNG;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Differentbrowsers {

	       WebDriver Driver;
	@Test
	@org.testng.annotations.Parameters("broswers")
	public void browsertest (String browsrname) {
		
		if(browsrname.equals("chrome"))
		{	
	
		WebDriverManager.chromedriver().setup();
		Driver=new ChromeDriver();	
		}
			
	
	
		else if(browsrname.equals("chrome")) {
			WebDriverManager.edgedriver().setup();
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("http://poojastore.marolix.com/Authenticate/Login");
	
		driver.findElement(By.name("emailid")).sendKeys("pooja132@gmail.com");
		driver.findElement(By.name("pword")).sendKeys("1234");
		
		driver.findElement(By.xpath("(//div[@class='col-md-6']//button)[1]")).click();
		String url = driver.getCurrentUrl();
		Assert.assertEquals("",url);
	}
}
