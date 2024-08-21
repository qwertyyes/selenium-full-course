package newe.newtestpageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logingtest {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver= new ChromeDriver();
	    
	    loginpage2 loginpg = new loginpage2(driver);
	    
	    driver.get("https://www.saucedemo.com/v1/");
	    
	    loginpg.enterusername("standard_user");
	    loginpg.enterpassword("secret_sauce");
	    
	    loginpg.clickonloginBTn();
	}

}
