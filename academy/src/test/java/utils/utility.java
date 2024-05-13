package utils;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utility {

	public static void capturescreenshot(WebDriver driver ,int testid) {
		
		DateTimeFormatter date=DateTimeFormatter.ofPattern("yyyy-MM-dd-HH mm ss");
		LocalDateTime now= LocalDateTime.now();
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         File dest=new File("test-output//screenshot//Test-"+testid+" "+date.format(now)+".jpeg");
              FileHandler.copy(source, dest);

	\
	}
	
	
}
