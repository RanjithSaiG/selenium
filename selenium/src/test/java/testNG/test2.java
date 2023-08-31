package testNG;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test2 {

	WebDriver driver;
	
	private String Logouturl;

	private Object urlhomepage;
@BeforeClass	
	
public void setbrowser()	{
	
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
}
	
	@Test
	
	public void Homepage( ) {
		
		driver.get("http://poojastore.marolix.com/Authenticate/Login");
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://poojastore.marolix.com/Authenticate/Login",url);
	
	}
	
	@Test
	
	public void login() {
		
		driver.findElement(By.name("emailid")).sendKeys("pooja132@gmail.com");
		driver.findElement(By.name("pword")).sendKeys("1234");
	    driver.findElement(By.xpath("//div[@class='col-md-6']/button")).click();
			   
		String urlhomepage=driver.getCurrentUrl();
		Assert.assertEquals("http://poojastore.marolix.com/Adimn/Dashboard",urlhomepage);
		
		
	}
	
@Test 
	
	public void logout( ) {
		
	driver.findElement(By.xpath("//s[@data-toggle='dropdown']")).click();
	
	driver.findElement(By.xpath("//s[@class='dropdown-item']")).click();
	
	Assert.assertEquals("http://poojastore.marolix.com",  Logouturl);
}
	
	
	@AfterClass
	
	public void teradown()     throws Throwable  {
	
	Thread.sleep(5000);
	driver.quit();
	}
}
