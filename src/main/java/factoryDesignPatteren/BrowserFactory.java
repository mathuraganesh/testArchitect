package factoryDesignPatteren;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserFactory {
	
	
	public static WebBrowser launchBrowserByName(BrowserNames browserName) {
		
				
		switch(browserName){
		case chrome:
			return new ChromeBrowser();
			
		case firefox:
			return new FirefoxBrowser();
		
		default:
			throw new IllegalArgumentException("Unknown Browser Type");
						
		}
				
	}
	
	
	
	public static void postStepAfterLaunchBrowser(WebDriver driver) {
		
		CommonBrowserActions.Maximize(driver);
		CommonBrowserActions.loadTheUrl(driver);
		CommonBrowserActions.setImplicitWait(driver);
	}

}
