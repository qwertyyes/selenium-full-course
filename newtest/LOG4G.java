package newe.newtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LOG4G {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saurabh\\Downloads\\important data pleases donot delete this\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
	     WebDriver driver = new ChromeDriver();
	     
	     driver.get("");
	     
	}

}
