package Com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.PageObject.Loginpom;
import Com.Utility.BaseClass;
import Com.Utility.Library;

public class Tc_001 extends BaseClass {
	@Test
	public void verify_login_crendential () {
	Loginpom	login=PageFactory.initElements(driver, Loginpom.class);
	Library.custom_sendkeys(login.getText_emailid(),excel.getstringdata("Sheet1", 0, 0));
	
	Library.custom_sendkeys(login.getText_password(),excel.getstringdata("Sheet1", 0, 1) );
	Library.custom_click(login.getText_login());
	Library.custom_HandleDropDrown(null, null);
	Library.custom_HandleMouseoverclick(null, null);
	
	
	
		


}
}