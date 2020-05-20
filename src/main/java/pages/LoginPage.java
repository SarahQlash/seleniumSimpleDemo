package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends HomePage{
	
private WebDriverWait wait;

	public LoginPage(WebDriver driver) {
		super(driver);
		
		wait= new WebDriverWait(driver, 60);
		
			 
	}
	
	@FindBy(id = "email")
	WebElement emailTxt;
	@FindBy(css = ".btn.btn-block.btn-primary.next")
	WebElement nextBtn;
	@FindBy(id = "password")
	WebElement passwordTxt;
	@FindBy(xpath = "//form[@id='loginForm2']/div[@class='col-md-12 p-0']")
	WebElement loginBtn;
	
	@FindBy(xpath = "/html//a[@id='navbarDropdown']")
	WebElement clkOnDDl;
	
	@FindBy(xpath = "//div[@id='page-content-wrapper']//nav[@class='bottomHeader navbar']/div/div[3]/ul//a[@href='https://www.gocardi.com/logout']")
	public WebElement logoutBtn;
	
	public void userLogin(String email, String password) {
		setTextElementText(emailTxt,email);
		clkBtn(nextBtn);
		setTextElementText(passwordTxt, password);
		clkBtn(loginBtn);
		
	}
	
	public void userCanLogout() {
		wait.until(ExpectedConditions.elementToBeClickable(clkOnDDl));
		clkBtn(clkOnDDl);
		
		wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
		clkBtn(logoutBtn);
		
		
		
	}

}
