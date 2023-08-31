package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v112.css.model.Value;

public class Webtable {

	private static final char[] value = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		
		int rowsCount = driver.findElements(By.xpath("//table[@id='countries']//tr")).size();
		System.out.println(rowsCount);
	
		int columnsCount = driver.findElements(By.xpath("//table[@id='countries']//tr[1]//td")).size();
		System.out.println(columnsCount);
		
		for(int i=2;i<=rowsCount;i++) {
			System.out.print(i+":");
		
		for(int j=2;j<=columnsCount;j++) {
			
			
        String  value = driver.findElement(By.xpath("//table[@id='countries']//tr["+i+"]//td["+j+"]")).getText();
		}
		System.out.println(value) ;
			
		}	
		
		
	
		cellValue(driver,"4","4");
		cellValue(driver,"5","3");
		
		checkBoxClick(driver,"1o");
		
		checkBoxClick(driver,"15");
	}
		public static void cellValue(WebDriver driver,String rowNumber,String columnNumber) {
			
			String cellValue = driver.findElement(By.xpath("//table[@id='countries']//tr["+rowNumber+"]//td["+columnNumber+"]")).getText();
		
		System.out.println(cellValue);
		}
		public static void checkBoxClick(WebDriver driver,String rowNumber) {
	 driver.findElement(By.xpath("//table[@id='contrise']//tr["+rowNumber+"]//td[1]//input")).click();
		
				
		}
		
		}

