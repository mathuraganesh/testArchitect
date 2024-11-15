package factoryDesignPatteren;


import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class FirefoxBrowser implements WebBrowser{

	private static final Logger logger=Logger.getLogger(FirefoxBrowser.class.getName());
	
	@Override
	public WebDriver launchBrowser() {
		WebDriverManager.firefoxdriver().setup();
		logger.info("Fire Fox Launched");
		return new FirefoxDriver();
		
	}

}
