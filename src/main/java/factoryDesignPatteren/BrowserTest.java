package factoryDesignPatteren;

import java.util.Map;

import org.openqa.selenium.WebDriver;

public class BrowserTest {

	public static void main(String[] args) {
		WebDriver driver = BrowserFactory.launchBrowserByName(BrowserNames.firefox).launchBrowser();
		BrowserFactory.postStepAfterLaunchBrowser(driver);
		Map<String, String> data = DataSourceFactory.DataSourceType(DataSourceName.HardCoded).dataSource();
		DataSourceFactory.loginApplication(data,driver);

	}

}
