package LeftMenu.LeftMenuAuto;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

//If we get java Initialise error then we need to add Vm argument in Run config "--add-opens java.base/java.lang=ALL-UNNAMED", 
//apply and run
public class LeftMenuCompleteAutomation1 extends BaseClass {

	public LoginPageTC login;
	public TakeSelfieTC selfie;
	public AttendanceTC attendance;
	public LeftMenuTC menu;
	

	@Test(priority = 1, groups = "Left Menu")
	public void login() throws InterruptedException, IOException {

		login = new LoginPageTC(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		login.ClickLocationAcceptButton();

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C://eclipse-java-2022-06-R-win32-x86_64//eclipse//TestingTask//src//test//java//Resources//data.properties");

		prop.load(fis);
		
		login.EnterMobileNumber(prop.getProperty("mobileNumber"));
		login.EnterPassword(prop.getProperty("password"));
		login.ClickLoginBtn();
		
	}

	@Test(priority = 2, groups = "Selfie")
	public void selfieScreen() throws InterruptedException {

		selfie = new TakeSelfieTC(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		selfie.Shower();
		selfie.Charger();
		selfie.PowerBank();
		selfie.Uniform();
		selfie.Backpack();
		selfie.SwipingMachine();
		selfie.idCard();
		selfie.selfie();
		selfie.cameraClick();
		selfie.cameraOk();
		selfie.signIn();
//		attendance = new AttendanceTC(driver);
//		attendance.Present();
	}
	

	@Test(priority = 3, groups = "Left Menu")
	public void leftmenu() throws InterruptedException {

		menu = new LeftMenuTC(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		menu.hamburgerMenu();
		menu.EditProfile();
		
		menu.hamburgerMenu1();
		menu.Off_ON_duty();
		Thread.sleep(1000);
		menu.vaccination();
	
		menu.hamburgerMenu1();
		menu.Performance();
		menu.taskDetailsBtn();
		
		menu.hamburgerMenu1();
		menu.Goals();
		menu.Backarrow();
		
		menu.hamburgerMenu1();
		menu.History();
		
	
		menu.hamburgerMenu1();
		menu.CustomerCash();
	
		menu.hamburgerMenu1();
		menu.Conveyance();
		Thread.sleep(2000);
		menu.Backarrow();

		menu.hamburgerMenu1();
		menu.Attendance();
		Thread.sleep(2000);
		menu.Backarrow();

		menu.hamburgerMenu1();
		menu.additions();
		Thread.sleep(2000);
		menu.Backarrow();
		Thread.sleep(2000);

		menu.hamburgerMenu1();
		menu.payout();
		
		menu.hamburgerMenu1();
		menu.Payment();
		Thread.sleep(2000);
		menu.Backarrow();

		menu.hamburgerMenu1();
		menu.deductions();
		menu.Backarrow();

		menu.hamburgerMenu1();
		menu.Mishaps();
		menu.Backarrow();

		menu.hamburgerMenu1();
		menu.BankDetails();
		Thread.sleep(2000);
		menu.Backarrow();

		menu.hamburgerMenu1();
		menu.Audit();
		menu.AuditCommentNo("testing");
		menu.Backarrow();

		menu.hamburgerMenu1();
		menu.Audit();
		menu.AuditCommentYes("testing");

		menu.hamburgerMenu1();
		Thread.sleep(1000);
		menu.Notification();
		menu.Backarrow();

		menu.hamburgerMenu1();
		menu.Retraining();
	
		
		
	}

}
