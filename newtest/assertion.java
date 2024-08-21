package newe.newtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertion {
	
	@Test
	public void assertion() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saurabh\\Downloads\\important data pleases donot delete this\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
	     WebDriver driver = new ChromeDriver();
	     
	     SoftAssert softverify = new  SoftAssert();
	     
	     driver.get("https://testautomationpractice.blogspot.com/");
	     System.out.println("verifying title");
	     String expectedTitle= "Automation Testing Practice";
	     String actualtitle = driver.getTitle();
	     softverify.assertEquals(expectedTitle, actualtitle,"Title verified");
	     
	   System.out.println("verifying logo icon");
	   WebElement icon = driver.findElement(By.className("wikipedia-icon"));
	   softverify.assertTrue(icon.isDisplayed());
	   
	   System.out.println("verifying search button");
	   WebElement icon1 = driver.findElement(By.className("wikipedia-search-button"));
	   softverify.assertTrue(icon1.isDisplayed());
	   
	   driver.close();
	   
	     
	     
	}

}
