package auto;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	@FindBy(xpath="//span[text()='Abhinav Bhopi']") private WebElement profile;

	@FindBy(xpath="//span[text()=//span[text()='Log out']") private WebElement logout;

	public Logout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void profileclick() {
		profile.click();
	}
   public void logoutclick() {
	   logout.click();
   }

}
