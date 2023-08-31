package tanu;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screenshortram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
         TakesScreenshot ts=(TakesScreenshot)driver;
         File source =ts.getScreenshotAs(OutputType.FILE );
         
         File target=new File(".//src/maven.png");
         FileUtils.copyFile(source, target);
         
	}

}