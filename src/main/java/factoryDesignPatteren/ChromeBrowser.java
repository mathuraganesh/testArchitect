package factoryDesignPatteren;



import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class ChromeBrowser implements WebBrowser {

	private static final Logger logger=Logger.getLogger(ChromeBrowser.class.getName());
	
	
	@Override
	public WebDriver launchBrowser() {
		WebDriverManager.chromedriver().setup();
		logger.info("Chrome Launched");
		return new ChromeDriver();
		
	}

}
