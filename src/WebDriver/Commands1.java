package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
	  	WebDriver driver=new ChromeDriver();
	  	driver.get("file:///F:/EduBridge/Batch%202022%207385/MyPage.html");
	  	//driver.findElement(By.linkText("Click here to Search Jobs")).click();
	  	driver.findElement(By.partialLinkText("Click")).click();
	}

}
