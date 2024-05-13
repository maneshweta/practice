package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browser {
	
}
	public WebDriver openchromebrowser() {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shree\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
//		        ChromeOptions options=new ChromeOptions();
//		
//	     options.addArguments("--remote-allow-origins=*");
//		
//			
	//      WebDriver driver=new ChromeDriver(options);
		  WebDriver driver=new FirefoxDriver();
		//	return driver;
		return driver;
		

}
