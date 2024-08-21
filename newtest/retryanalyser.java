package newe.newtest;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryanalyser implements IRetryAnalyzer {
	
	int counterattempts = 0;
	
	int setMaxlimitforfactory= 3;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if (!result.isSuccess()) 
		{
			if (counterforRetryattempts< setmaxlimitforretry) 
			{
				counterdforRetryattempts++;
				return true;
			}
		}
		
		return false;
	}
	

}
