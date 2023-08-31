package tanu;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Alerts {

public static void mian (String[]  args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	
	driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	Alert a=driver.switchTo().alert();
	
	System.out.println(a.getText());
	a.accept();

	
}





}
