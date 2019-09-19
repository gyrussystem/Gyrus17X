package Manage_System;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Utility.UtilityMethods;
import Utility.UtilityMethods.operationtype;

public class Assign_Operation extends BaseInitManageSystem{

	@Test
	public static void Assignment() throws InterruptedException 
	{

		Thread.sleep(7000);
		UtilityMethods.ExplicitWait_Operation("LINK_ORG", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("CH_ORG", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("SHOW_SEL_ORG", operationtype.eclick, "", "XPATH");

		Thread.sleep(3000);
		UtilityMethods.ExplicitWait_Operation("LINK_JOB", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("CH_JOB", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("SHOW_SEL_JOB", operationtype.eclick, "", "XPATH");
		
		Thread.sleep(3000);
		UtilityMethods.ExplicitWait_Operation("LINK_SUPERVISOR", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("CH_SUPERVISOR", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("SHOW_SEL_SUPERVISOR", operationtype.eclick, "", "XPATH");
		
		Thread.sleep(3000);
		UtilityMethods.ExplicitWait_Operation("LINK_STAFF", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("CH_STAFF", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("SHOW_SEL_STAFF", operationtype.eclick, "", "XPATH");

		UtilityMethods.ExplicitWait_Operation("BTN_NEXT_EMPLOYEE", operationtype.eclick, "", "XPATH");
		System.out.println("Assignment Operation Done");
		
		
		Thread.sleep(3000);
		UtilityMethods.ExplicitWait_Operation("LINK_CERTIFICATE", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("CH_CERTIFICATE", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("SHOW_SEL_CERTIFICATE", operationtype.eclick, "", "XPATH");
		
		Thread.sleep(3000);
		UtilityMethods.ExplicitWait_Operation("LINK_TRAINING_REQ", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("CH_TRAINING_REQ", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("SHOW_SEL_TRAINING_REQ", operationtype.eclick, "", "XPATH");
		
		Thread.sleep(3000);
		UtilityMethods.ExplicitWait_Operation("LINK_TRAINING_OBTAIN", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("CH_TRAINING_OBTAIN", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("SHOW_SEL_TRAINING_OBTAIN", operationtype.eclick, "", "XPATH");

		UtilityMethods.ExplicitWait_Operation("BTN_NEXT_EMPLOYEE", operationtype.eclick, "", "XPATH");
		System.out.println("Advance Assignment Operation Done");
		

	}
}
