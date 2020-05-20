package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegisterationPage extends PageBase{

	public UserRegisterationPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "firstname")
	WebElement firstNameTxt;
	@FindBy(id = "lastname")
	WebElement lastNameTxt;
	@FindBy(id = "email")
	WebElement emailTXt;
	@FindBy(id = "password")
	WebElement passwordTxt;
	@FindBy(id = "checkbox1")
	WebElement checkBox;
	@FindBy(css  = ".btn.btn-block.btn-primary.register")
	WebElement registerBtn;
	@FindBy(css = ".card-header")
	public WebElement sucessRegisterTxt;
	
	
	

	public void userRegisteration(String firstName, String lastName , String email, String password) {
		setTextElementText(firstNameTxt, firstName);
		setTextElementText(lastNameTxt, lastName);
		setTextElementText(emailTXt, email);
		setTextElementText(passwordTxt, password);
		clkBtn(checkBox);
		clkBtn(registerBtn);

	}

}
