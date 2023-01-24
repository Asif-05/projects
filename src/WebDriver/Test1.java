package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
	   	WebDriver driver=new ChromeDriver();
	   	
	   	driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	    String url=driver.getCurrentUrl();
	    String ps=driver.getPageSource();
	   	String title=driver.getTitle();
	    int len_ps=ps.length();
	    int len_title=title.length();
	   	driver.close();
	   	
	   	System.out.println("The URL is:"+url);
	   	System.out.println("The Page source is:"+ps);
	   	System.out.println("The title is:"+title);
	   	System.out.println("The length of page source is:"+len_ps);
	   	System.out.println("The length of title is:"+len_title);
	   			
	}

}
