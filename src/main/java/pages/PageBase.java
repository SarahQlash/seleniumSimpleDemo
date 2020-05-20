package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	
	//To work with element in the class/ page 
	protected WebDriver driver;

	//Create Constructor 
	public PageBase(WebDriver driver ) {

		PageFactory.initElements(driver, this);
	}
	
	protected static void clkBtn(WebElement button) {
		button.click();
		
	}
	
	protected static void setTextElementText (WebElement txtElement ,String value) {
		txtElement.sendKeys(value);
		
	}

}
