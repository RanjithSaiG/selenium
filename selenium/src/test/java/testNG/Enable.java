package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Enable {
	
	@Test
	public void test1() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("http:selectorshub.com/xpath-practice-page/");
	
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	
	
	
	
	}
}
