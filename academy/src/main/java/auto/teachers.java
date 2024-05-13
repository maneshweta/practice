package auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class teachers {
	
	
	@FindBy(xpath="//span[text()='Teachers']") private WebElement teacherss;
	
	@FindBy(xpath="//a[@role='button']") private WebElement entercode;
	
	@FindBy(xpath="//input[@maxlength='8']") private WebElement textcode;
	
	@FindBy(xpath="//button[@type='button']") private WebElement Continue;
	@FindBy(xpath="//a[@role='button']") private WebElement back;
	
	@FindBy(xpath="//input[@id='coach-email']")private WebElement teachermail;

//	@FindBy(xpath="//input[@type='submit']")private WebElement submitbutton;
	

	public teachers(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	 
	 public void teacherss() {
		 teacherss.click();
	 }
	 public void Entercode() {
		 entercode.click();
	 }
	 public void Textcode() {
		 textcode.sendKeys("shweta");
	 }
	 public void COntinue() {
		 Continue.click();
	 }
	 
	 public void Back() {
		 back.click();
	 }
	 
	 public void Teachermail() {
		 teachermail.sendKeys("dkhfdkhkh");
	 }
//	 public void Submitbutton() {
	//	 submitbutton.click();
	 //}
	 
}
