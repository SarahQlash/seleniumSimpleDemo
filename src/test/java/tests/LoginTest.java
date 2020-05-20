package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends TestBase {
	
	HomePage homeObj;
	LoginPage loginObj;
	
	@Test
	public void userCanLogout() {
		loginObj=new LoginPage(driver);
		loginObj.userCanLogout();
		Assert.assertTrue(loginObj.logoutBtn.getText().contains("Logout"));
		
		
	}

}
