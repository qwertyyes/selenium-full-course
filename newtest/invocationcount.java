package newe.newtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class invocationcount { 
    @Test(invocationCount= 5)
  public void invocation(ITestContext context)  
  {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\saurabh\\Downloads\\important data pleases donot delete this\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    	
        WebDriver driver = new ChromeDriver();
    //System.out.print("one");
        
        int currentinvoc = context.getAllTestMethods()[0].getCurrentInvocationCount();
        System.out.println("Execution"+currentinvoc);
        
        System.out.println("Testmethod1");
        
        
  }
    @Test
	public void testmethod2(ItestContext context) 
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\saurabh\\Downloads\\important data pleases donot delete this\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    	
        WebDriver driver = new ChromeDriver();
        int currentinvoc2 = context.getAllTestMethods()[1].getCurrentInvocationCount();
        System.out.println("Execution"+currentinvoc2);
        
        System.out.println("Testmethod2");
     }
}