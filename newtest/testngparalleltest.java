package newe.newtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class testngparalleltest {

	@Test
	public void testcase1() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\saurabh\\Downloads\\important data pleases donot delete this\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
     WebDriver driver = new ChromeDriver();
     
     driver.get("https://www.saucedemo.com/v1/");
     
    WebElement element =  driver.findElement(By.xpath("//div[@class='login_logo']"));
    
    Assert.assertTrue(element.isDisplayed());
    
    Thread.sleep(2000);
}  
	@Test
	public void testcase2() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\saurabh\\Downloads\\important data pleases donot delete this\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
     WebDriver driver = new ChromeDriver();
     
     driver.get("https://www.saucedemo.com/v1/");
     
     Assert.assertEquals(driver.getTitle(), "Swag Labs");
     driver.quit();

	}
}