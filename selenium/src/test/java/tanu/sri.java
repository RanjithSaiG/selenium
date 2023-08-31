package tanu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class sri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver =new FirefoxDriver();

driver.manage().window().maximize();

driver.get("https://itera-qa.azurewebsites.net/home/automation");

driver.findElement(By.id("name")).sendKeys("ranjith");
driver.findElement(By.id("phone")).sendKeys("9934511345");
driver.findElement(By.id("email")).sendKeys("ranjith.sai16@gmail.com");
driver.findElement(By.id("password")).sendKeys("Tanusri@123");
driver.findElement(By.id("address")).sendKeys("chitnthampalli,(village)chinthalapudi(M.D)Eluru(DT)");

driver.findElement(By.id("male")).click();

driver.findElement(By.id("wednesday")).click();



WebElement droupdown=driver.findElement(By.xpath("//select[@class='custom-select']"));
Select sel = new Select(droupdown);
sel.selectByVisibleText("Turkey");
driver.findElement(By.xpath("//label[text()='4 years']")).click();

driver.findElement(By.xpath("//label[text()='Selenium Webdriver']")).click();
	}
	
	
	

}
