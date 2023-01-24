package WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
	  	WebDriver driver=new ChromeDriver();
	  	
	  	driver.get("https://www.google.com/");
	  	driver.findElement(By.xpath("//body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")).click();
	    driver.findElement(By.li)
	 
	  	List<WebElement>t= driver.findElements(By.tagName("a"));
        
	  	System.out.println("The no of links are:"+t.size());
	    for(WebElement res:t)
	    {
	    	String s=res.getText();
	    	System.out.println(s);
	    }
        
        
        
        
        
	}

}
