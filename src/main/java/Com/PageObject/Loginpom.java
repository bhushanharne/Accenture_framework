package Com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpom {
	@FindBy(how=How.XPATH ,using="//input[@id='email']")
	private WebElement text_emailid;
	

	
	@FindBy(how=How.XPATH ,using="//input[@id='pas']")
	private WebElement text_password;

	@FindBy(how=How.XPATH ,using="//button[@name='login']")
	private WebElement text_login;

	public WebElement getText_emailid() {
		return text_emailid;
	}

	
	public WebElement getText_password() {
		return text_password;
	}

	
	public WebElement getText_login() {
		return text_login;
	}

	
}
