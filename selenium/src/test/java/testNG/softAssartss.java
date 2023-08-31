 
package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssartss {

	@Test
	
	public void Test() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("http://admin.hospiol.com/site/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		SoftAssert sf=new SoftAssert();
		WebElement user=driver.findElement(By.name("username"));
		WebElement pass=driver.findElement(By.name("password"));
		
		sf.assertTrue(user.isEnabled());
		
		driver.findElement(By.name("username")).sendKeys("ranjith@marolix.com");
		sf.assertTrue(pass.isEnabled());
		 
		driver.findElement(By.name("password")).sendKeys("Reset@123");
		driver.findElement(By.xpath("//button[@class='btn']")).click();
		
		sf.assertAll();
		//String url=driver.getCurrentUrl();
		//sf.Assert.softassertEquals("http://admin.hospiol.com/admin/admin/dashboard",url);
	}
}
	

		
		
		
		
		
	

