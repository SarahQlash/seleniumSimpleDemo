package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends PageBase {
	
	private WebDriverWait wait;
	

	public HomePage(WebDriver driver) {
		super(driver);
		wait = new WebDriverWait(driver, 60);	
	}
	
	
	@FindBy(css = ".nav-link.secLang")
	WebElement selectLang;
	
	@FindBy(xpath ="//div[@id='page-content-wrapper']/header/nav[1]//ul[@class='nav rightnavheader']/li[1]")
	WebElement registerLink;
	
	@FindBy(xpath = "//div[@id='page-content-wrapper']/header/nav[1]//ul[@class='nav rightnavheader']/li[2]")
	WebElement loginLink;
	
	public void openRegistrationPage() {
		wait.until(ExpectedConditions.elementToBeClickable(selectLang));
		clkBtn(selectLang);
		
		wait.until(ExpectedConditions.elementToBeClickable(registerLink));
		clkBtn(registerLink);
		
		
	}
	
	public void openLoginPage() {
		wait.until(ExpectedConditions.elementToBeClickable(loginLink));
		clkBtn(loginLink);
		
	}
	

}
