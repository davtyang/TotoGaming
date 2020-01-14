package am.inecobank.pages.signin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import am.inecobank.pages.base.InecobankBasePageObject;

public class SignInPage extends InecobankBasePageObject {
	public SignInPage(WebDriver driver) {
		super(driver);
	}

	public final String USERNAME_INPUT = "//input[@id='txtUserName']";
	public final String PASSWORD_INPUT = "//input[@id='txtPassword']";
	public final String LOGIN_CLICK = "//input[@value='Log In']";

	@FindBy(xpath = USERNAME_INPUT)
	WebElement usernameInputField;

	@FindBy(xpath = PASSWORD_INPUT)
	WebElement passwordInputField;

	@FindBy(xpath = LOGIN_CLICK)
	WebElement clickLoginbtn;

	public final SignInPage fillUsername(String username) {
		waitForElementPresent(USERNAME_INPUT);
		usernameInputField.sendKeys(username);
		return new SignInPage(driver);
	}

	public final SignInPage fillPassword(String password) {
		waitForElementPresent(PASSWORD_INPUT);
		usernameInputField.sendKeys(password);
		return new SignInPage(driver);
	}

	public final SignInPage clickLogin() {
		waitForElementPresent(LOGIN_CLICK);
		clickLoginbtn.click();
		return new SignInPage(driver);

	}
}
