package newe.newtestpageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginwithoutpom {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saurabh\\Downloads\\important data pleases donot delete this\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
	     WebDriver driver = new ChromeDriver();
	     
	     driver.get("https://www.saucedemo.com/v1/");
	     driver.findElement(By.id("user-name")).sendKeys("standard_user");
	     
	     driver.findElement(By.id("password")).sendKeys("secret_sauce");
	     
	     driver.findElement(By.id("login-button")).click();
	}

}
