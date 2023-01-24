package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bankapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
	  	WebDriver driver=new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
	   	//WebDriver driver=new FirefoxDriver();
	   	//driver.get("https://www.google.com/");
	   	
	   	driver.navigate().to("https://www.google.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        
		
	}

}
