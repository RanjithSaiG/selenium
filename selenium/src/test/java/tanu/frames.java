package tanu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	private static final String WebElement = null;

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file//c:/users/hp/desktop/HTML/page1.html");
	Thread.sleep(2000);
	
	driver.switchTo().frame(0);
	driver.switchTo().frame("frid");
	driver.switchTo().frame("frnm");
	driver.switchTo().frame("frc1");
	
	
 
	}

}
