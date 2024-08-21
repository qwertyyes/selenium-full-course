package newe.newtestpageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
			
		WebDriver driver;
		
		loginpage(WebDriver d)
		{
			
			driver= d;
			
		}
		
		By username= By.id("user-name");
		By password = By.id("password");
		By loginbtn= By.id("login-button");
		
	public void enterusername(String uname) 
	{
		driver.findElement(username).sendKeys(uname);
	}
	
	public void enterpassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
		
	}
	public void clickonloginBTn() {
		driver.findElement(loginbtn).click();
	}
		
		
	}


