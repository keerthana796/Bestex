package LeftMenu.LeftMenuAuto;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AttendanceTC {
	
public AndroidDriver driver;
	
	public AttendanceTC(AndroidDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	  @AndroidFindBy(id="com.north.ambassador:id/bt_present")
		private WebElement PresentBtn;
	    
	    public void Present() {
	    	System.out.println(PresentBtn.getText());
	    	if(PresentBtn.isDisplayed()) {
	    	  	PresentBtn.click();
	    	}
	    	else {
	    		System.out.println("Attendance not marked");
	    	}
	  
	    }

}
