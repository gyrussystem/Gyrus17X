package Master;

import org.testng.annotations.Test;

import Utility.UtilityMethods;
import Utility.UtilityMethods.operationtype;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class Log_Out extends BaseInitMaster{
 
  @BeforeTest
  public void CheckTestCaseExecution() {
	  
	  if(!UtilityMethods.checkExecutionModeTestCase(Test_Cases, this.getClass().getSimpleName(), "Master"))
	  {
		  throw new SkipException("Execution mode of testcase set No");
	  }
  }
  
  @Test
  public static void Logout() throws InterruptedException {
	  
	  Thread.sleep(5000);
	  UtilityMethods.ExplicitWait_Operation("BTN_LOGOUT", operationtype.eclick, "", "XPATH");
	  System.out.println("-----Logout--------");
	 String Expectedurl ="https://vipul.gyrusaim.net/auth/login1";
	  try {
		  
		  assertEquals(true, driver.getCurrentUrl()==Expectedurl);
	  
		  System.out.println("Logout Done Succussfully"); 
	  
	 // else {
		  
		//  System.out.println("Logout URL missmatch , Assert Failed!!"); 
	//  }
	  }catch (Exception e) {
		  System.out.println("Logout URL missmatch , Assert Failed!!"); 
		  System.out.println(e.toString());
		// TODO: handle exception
	}
	
  }
	@AfterMethod
	public void testIT(ITestResult result)
	{
	if(ITestResult.FAILURE==result.getStatus())
	{
	UtilityMethods.captureScreenshot(driver, result.getName());
	}
	driver.quit();
	}
	
}