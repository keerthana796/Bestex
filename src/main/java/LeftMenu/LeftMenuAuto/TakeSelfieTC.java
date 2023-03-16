package LeftMenu.LeftMenuAuto;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TakeSelfieTC {
public AndroidDriver driver;
	
	public TakeSelfieTC(AndroidDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	
	@AndroidFindBy(id="com.north.ambassador:id/activity_ambassador_check_in_shower_sw")
	private WebElement Shower;
	
	@AndroidFindBy(id="com.north.ambassador:id/activity_ambassador_check_in_charger_sw")
	private WebElement Charger;
	
	@AndroidFindBy(id="com.north.ambassador:id/activity_ambassador_check_in_power_bank_sw")
	private WebElement PowerBank;
	
	@AndroidFindBy(id="com.north.ambassador:id/activity_ambassador_check_in_uniform_sw")
	private WebElement Uniform;
	
	@AndroidFindBy(id="com.north.ambassador:id/activity_ambassador_check_in_back_pack_sw")
	private WebElement Backpack;
	
	@AndroidFindBy(id="com.north.ambassador:id/activity_ambassador_check_in_swiping_machine_sw")
	private WebElement SwipingMachine;
	
	@AndroidFindBy(id="com.north.ambassador:id/activity_ambassador_check_in_id_card_sw")
	private WebElement idCard;

	@AndroidFindBy(id="com.north.ambassador:id/activity_ambassador_take_selfie_btn")
	private WebElement selfie;
	
	
	@AndroidFindBy(id="com.android.camera:id/bottom_bar")
	private WebElement cameraClick;
	
	@AndroidFindBy(id="com.android.camera:id/done_button")
	private WebElement cameraOk;
	
	@AndroidFindBy(id="com.north.ambassador:id/activity_ambassador_check_in_btn")
	private WebElement signIn;
	
	
    public void Shower() throws InterruptedException {
    	
    	Shower.click();
    	Thread.sleep(5000);
    }
    public void Charger() {
    	Charger.click();
    }
    public void PowerBank() {
    	PowerBank.click();
    	
    }
    public void Uniform() {
    	Uniform.click();
    }
    public void Backpack() {
    	Backpack.click();
    }
    public void SwipingMachine() {
    	SwipingMachine.click();
    }
    public void idCard() {
    	idCard.click();
    }
    public void selfie() {
    	selfie.click();
    }
    public void cameraClick() {
    	cameraClick.click();
    }
    
    public void cameraOk() {
    	cameraOk.click();
    }
    public void signIn() {
    	signIn.click();
    }
    
  


}
