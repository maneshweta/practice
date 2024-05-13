package auto;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
		// step 1 to declare the data members global variables
		@FindBy(xpath="//a[@class='_aglhg38']")private WebElement loginlink;
	    
		@FindBy(xpath="//input[contains(@id,'uid-login')][1]") private WebElement sername;
		
		@FindBy(xpath="//input[@type='password']") private WebElement password;
		
		@FindBy(xpath="//button[@type='submit']") private WebElement loginbutton;
		
		// step 2 initialization of variable or DM
	
		public Login(WebDriver driver) {
			PageFactory.initElements(driver, this); // constructor

		}
		//step 3 create method
		public void Loginlink() {
			loginlink.click();// encapsulation
		}
		 public void username() {
			 sername.sendKeys("Abhinavvelocity");
		 }
		public void password() {
			password.sendKeys("Abhi@1804");
		}
		public void loginbutton() {
			loginbutton.click();
		}
	}


