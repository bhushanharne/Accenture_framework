package Com.Utility;

import javax.swing.text.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;

public class Library {
	 public static ExtentTest test;

	public static void custom_sendkeys(WebElement Element,String value) {
		try {
			Element.sendKeys(value);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
			
		
		
	}
	public static void custom_click(WebElement Element) {
		try {
			Element.click();
		}catch(Exception e) {
		System.out.println(e.getMessage());
		}
	}
		public static void custom_HandleDropDrown(WebElement element, String Text) {
			try {
				Select sel=new Select(element);
				sel.selectByVisibleText(Text);
				
			}catch(Exception e){
				System.out.println(e.getMessage());
				
			
		}}
			public static void custom_HandleMouseoverclick(WebDriver driver,WebElement element) {
				try {
					Actions act=new Actions(driver);
					act.moveToElement(element);
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
}
}