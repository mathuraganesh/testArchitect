package factoryDesignPatteren;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataSourceFactory {

	public static TestDataProvider DataSourceType(DataSourceName dataSourceName) {

		switch(dataSourceName) {
		
			case Excel:
				
				return null;
			
			case HardCoded:
				
				return new HardCodeData();
				
			default:
				throw new IllegalArgumentException("Unknown Data Source");
		}
		
	}
	
	public static void loginApplication(Map<String,String> data,WebDriver driver) {
		driver.findElement(By.id("username")).sendKeys(data.get("userName"));
		driver.findElement(By.id("password")).sendKeys(data.get("password"));
		driver.findElement(By.className("decorativeSubmit")).click();
	}
}
