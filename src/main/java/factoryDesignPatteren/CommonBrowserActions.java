package factoryDesignPatteren;

import java.time.Duration;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;



public class CommonBrowserActions {

	private static final Logger logger=Logger.getLogger(CommonBrowserActions.class.getName());
	
	public static void Maximize(WebDriver driver) {
		driver.manage().window().maximize();
		logger.info("Maximize the browser");
	}
	
	public static void setImplicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		logger.info("set the ImplicitWait");
	}
	
	public static void loadTheUrl(WebDriver driver) {
		driver.get("http://leaftaps.com/opentaps/control/main");
		logger.info("Load the Url");
	}
}
