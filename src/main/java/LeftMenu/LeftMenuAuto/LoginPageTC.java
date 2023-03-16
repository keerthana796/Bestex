package LeftMenu.LeftMenuAuto;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPageTC {

	public AndroidDriver driver;

	public LoginPageTC(AndroidDriver driver) {

		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(id = "android:id/button1")
	private WebElement LocationAcceptBtn;

	@AndroidFindBy(id = "com.north.ambassador:id/activity_login_mobile_et")
	private WebElement mobileNumber;

	@AndroidFindBy(id = "com.north.ambassador:id/activity_login_password_et")
	private WebElement password;

	@AndroidFindBy(id = "com.north.ambassador:id/activity_login_submit_btn")
	private WebElement login;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.Toast")
	private WebElement toastmesssage;

	public void ClickLocationAcceptButton() {
		LocationAcceptBtn.click();
	}

	public void EnterMobileNumber(String mobile) {

		mobileNumber.sendKeys(mobile);
	}

	public void EnterPassword(String pass) {

		password.sendKeys(pass);
	}

	public void ClickLoginBtn() throws InterruptedException {

		login.click();
		Thread.sleep(2000);
//		try {
//			if (toastmesssage.isDisplayed()) {
//				if (toastmesssage.getText().contains("Location is not updated. Updating it now..")) {
//					System.out.println(toastmesssage.getText());
//					Thread.sleep(2000);
//					login.click();
//					System.out.println("clicked on login button 2 times");
//				}
//			}
//
//			else {
//				Thread.sleep(1000);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}
}
