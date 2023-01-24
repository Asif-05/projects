package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import one.Glink;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
	   	WebDriver driver=new ChromeDriver();
		
	   	driver.get("https://www.google.com/");
	   	
	    Pom l=new Pom(driver);
	    
	    l.getlink();

	}

}
