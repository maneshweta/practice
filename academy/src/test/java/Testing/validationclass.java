package Testing;

import org.testng.annotations.AfterClass;



import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.time.Duration;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import auto.Login;
import auto.Logout;
import auto.teachers;



public class validationclass {      
	
		WebDriver driver;
		Login login;
		teachers Teacher;
	    Logout llogout;
		@BeforeClass
		public void beforeclass() throws InterruptedException {
			System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shree\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
//			ChromeOptions options=new ChromeOptions();
//			
//		      options.addArguments("--remote-allow-origins=*");
//			
//				
//				WebDriver driver=new ChromeDriver(options);
//			
				WebDriver driver=new FirefoxDriver();
				
				
			//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			Thread.sleep(4000);
				driver.get("https://www.khanacademy.org/");
				
			

			
		}
		@BeforeMethod
		public void beforemethod() {
			
			 login=new Login(driver);
			 login.Loginlink();
			 login.username();
			 login.password();
			 login.loginbutton();
			
		}
		@Test
		public void to_verify_the_teacherpage() {
			 Teacher=new teachers(driver);
			 Teacher.teacherss();
			String url=driver.getCurrentUrl();
			System.out.println(url);
			
	//		if(url.equalsIgnoreCase("https://www.khanacademy.org/")) {
	//			System.out.println("test case is passed ");
	//		}
	//		else {
	//			System.out.println("test case is fail");
	//		}
		}
		
		@AfterMethod
		public void aftermethod() {
		 llogout= new Logout(driver);
		 llogout.profileclick();
		 llogout.logoutclick();
		}
		
	@AfterClass
		public void close() {
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.close();
		}
	
}
