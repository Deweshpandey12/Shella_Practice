package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_Loginclass 
{
	@FindBy(id="email")
	private WebElement emailTf;
	
	@FindBy(id="pass")
	private WebElement passTf;
	
	@FindBy(name="login")
	private WebElement passwordButton;

	public Fb_Loginclass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmailTf() {
		return emailTf;
	}

	public void setEmailTf(WebElement emailTf) {
		this.emailTf = emailTf;
	}

	public WebElement getPassTf() {
		return passTf;
	}

	public void setPassTf(WebElement passTf) {
		this.passTf = passTf;
	}

	public WebElement getPasswordButton() {
		return passwordButton;
	}

	public void setPasswordButton(WebElement passwordButton) {
		this.passwordButton = passwordButton;
	}
	
	
	
}
