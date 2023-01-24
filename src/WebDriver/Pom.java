package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pom {
	
WebDriver driver;
	
	public Pom(WebDriver driver)
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
