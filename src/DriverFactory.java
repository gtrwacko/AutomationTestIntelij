import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {

	static WebDriver getNewDriver(Main.Browser browser) {
		switch(browser) {
		case Chrome:
			return new ChromeDriver();
		case FireFox:
			return new FirefoxDriver();
		case IE:
			return new InternetExplorerDriver();
		default:
			return null;
		}
	}

}
