package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class LoginTest extends BaseClass {
	
	@Test
	public void testLogin() throws InterruptedException {
		
		LoginPage loginpage=new LoginPage(driver);
		
		Thread.sleep(3000);
		
		 loginpage.enterUsername("admin@yourstore.com");
		 Thread.sleep(3000);;
		 
		 loginpage.enterPassword("admin");
		 
		 loginpage.clickLogin();
		 
		 //System.out.println(driver.getTitle());
		    String Expectederesult="Dashboard / nopCommerce administration";
		    String actaulresult=driver.getTitle();
		    
		    Assert.assertEquals(Expectederesult, actaulresult);
		    
		
		
		
		
	}
	
	 

}
