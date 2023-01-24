package WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	WebDriver driver;
	
	public Links(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By GmailLink=By.linkText("Gmail");
	By Gmailimages=By.linkText("Images");
	
	public void getlink()
	{
	   	driver.findElement(GmailLink).click();
	}

}
