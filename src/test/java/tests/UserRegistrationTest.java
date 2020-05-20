package tests;

 

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.HomePage;
import pages.LoginPage;
import pages.UserRegisterationPage;

public class UserRegistrationTest extends TestBase {
	HomePage homeObj;
	UserRegisterationPage userRegisterObj;
	LoginPage loginObj ;
	Faker FakeData = new Faker();
	String firstName= FakeData.name().firstName();	
	String lastName= FakeData.name().lastName();	
	String email = FakeData.internet().emailAddress();
	String password = FakeData.number().digits(8).toString();
 
	
	@Test(priority = 1,alwaysRun = true)
	public void userCanRegisterSuccessfully() {
		homeObj = new HomePage(driver);
		homeObj.openRegistrationPage();
		
		userRegisterObj= new UserRegisterationPage(driver);
		userRegisterObj.userRegisteration(firstName, lastName, email, password);
		System.out.println(" User Data : " + firstName + " " + lastName + " " + email + " " + password + " ");
		Assert.assertTrue(userRegisterObj.sucessRegisterTxt.getText().contains("Registration Completed!"));

	}

	
	@Test(dependsOnMethods = "userCanRegisterSuccessfully")
	public void registertedUserCanLogin() {
		homeObj.openLoginPage();
		loginObj=new LoginPage(driver);
		loginObj.userLogin(email,password);
		
	}

}
