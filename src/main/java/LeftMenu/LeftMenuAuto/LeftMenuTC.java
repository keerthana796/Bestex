package LeftMenu.LeftMenuAuto;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import org.testng.asserts.SoftAssert;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;

public class LeftMenuTC {

	public AndroidDriver driver;

	public LeftMenuTC(AndroidDriver driver) {

		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	SoftAssert softassert = new SoftAssert();

	@AndroidFindBy(id = "com.north.ambassador:id/amb_details_layout")
	private WebElement EditProfile;

	@AndroidFindBy(id = "com.north.ambassador:id/amb_name_tv")
	private WebElement VerifyProfileName;

	@AndroidFindBy(id = "com.north.ambassador:id/id_arrow_iv")
	private WebElement Idcard;

	@AndroidFindBy(accessibility = "Logo")
	private WebElement IdcardTap;

	@AndroidFindBy(id = "com.north.ambassador:id/layout_id_emp_id_tv")
	private WebElement VerifyEmployeeid;

	@AndroidFindBy(id = "com.north.ambassador:id/layout_id_back_btn")
	private WebElement profilebackBtn;

	@AndroidFindBy(id = "com.north.ambassador:id/activity_profile_dl_arrow_iv")
	private WebElement DL;

	@AndroidFindBy(id = "com.north.ambassador:id/layout_id_title_tv")
	private WebElement VerifyDL;

	@AndroidFindBy(accessibility = "Front")
	private WebElement FrontDL;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]")
	private WebElement CameraPopup;

	@AndroidFindBy(accessibility = "Back")
	private WebElement BackDL;

	@AndroidFindBy(id = "com.north.ambassador:id/languageSettingsArrowiv")
	private WebElement LanguageSettings;

	@AndroidFindBy(id = "android:id/alertTitle")
	private WebElement VerifyLanguageSettings;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]")
	private WebElement SetEnglish;

	@AndroidFindBy(id = "android:id/button2")
	private WebElement skip;

	@AndroidFindBy(id = "android:id/button3")
	private WebElement EnglishPopupOk;

	@AndroidFindBy(id = "com.north.ambassador:id/professional_arrow_iv")
	private WebElement ProfessionalDetails;

	@AndroidFindBy(id = "com.north.ambassador:id/team_leader_name_tv")
	private WebElement VerifyProfessionalDetails;

	@AndroidFindBy(id = "com.north.ambassador:id/bank_details_arrow_iv")
	private WebElement BankDetails;

	@AndroidFindBy(id = "com.north.ambassador:id/bank_name_hint_lbl")
	private WebElement VerifyBankDetails;

	@AndroidFindBy(id = "com.north.ambassador:id/shift_btn")
	private WebElement Off_ON_duty;

	@AndroidFindBy(accessibility = "Close navigation drawer")
	private WebElement hamburgerMenu;

	@AndroidFindBy(accessibility = "Open navigation drawer")
	private WebElement hamburgerMenu1;

	@AndroidFindBy(id = "com.north.ambassador:id/design_menu_item_text")
	private WebElement vaccination;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.TextView")
	private WebElement Verifyvaccination;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.Button")
	private WebElement VaccinationSubmit;

	@AndroidFindBy(id = "com.north.ambassador:id/continue_btn")
	private WebElement VaccinationImageUploadedpopup;

	@AndroidFindBy(id = "com.north.ambassador:id/layout_vaccination_status_dose1_iv")
	private WebElement dose1;

	@AndroidFindBy(id = "com.android.camera:id/bottom_bar")
	private WebElement Camera;

	@AndroidFindBy(id = "com.android.camera:id/done_button")
	private WebElement CameraOk;

	@AndroidFindBy(id = "com.north.ambassador:id/layout_vaccination_status_dose2_tv")
	private WebElement dose2;

	@AndroidFindBy(accessibility = "Navigate up")
	private WebElement Backarrow;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[2]/android.widget.CheckedTextView")
	private WebElement Performance;

	@AndroidFindBy(id = "com.north.ambassador:id/activity_on_time_tasks_tv")
	private WebElement Verifyperformance;

	@AndroidFindBy(id = "com.north.ambassador:id/activity_on_time_performance_pb")
	private WebElement TaskPercent;

	@AndroidFindBy(id = "com.north.ambassador:id/activity_on_time_tasks_completed_pb")
	private WebElement TaskOntime;

	@AndroidFindBy(id = "com.north.ambassador:id/activity_tasks_delayed_pb")
	private WebElement TaskDelayed;

	@AndroidFindBy(id = "com.north.ambassador:id/activity_tasks_missed_pb")
	private WebElement TaskMissed;

	@AndroidFindBy(id = "com.north.ambassador:id/completed_task_tv")
	private WebElement TaskCompleted;

	@AndroidFindBy(id = "com.north.ambassador:id/activity_task_details_btn")
	private WebElement taskDetailsBtn;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[3]/android.widget.CheckedTextView")
	private WebElement Goals;

	@AndroidFindBy(id = "com.north.ambassador:id/consistency_lbl_tv")
	private WebElement VerifyGoals;

	@AndroidFindBy(id = "com.north.ambassador:id/daily_tasks_count_tv")
	private WebElement dailyIncentive;

	@AndroidFindBy(id = "com.north.ambassador:id/weekly_tasks_count_tv")
	private WebElement WeeklyIncentive;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[4]/android.widget.CheckedTextView")
	private WebElement History;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	private WebElement TaskhistoryFilter;

	@AndroidFindBy(id = "com.north.ambassador:id/activity_task_history_seekBar")
	private WebElement KmSlider;

	@AndroidFindBy(id = "com.north.ambassador:id/activity_task_history_year_sp")
	private WebElement Filteryear;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[5]")
	private WebElement FilterSelectyear;

	@AndroidFindBy(id = "com.north.ambassador:id/activity_task_history_month_sp")
	private WebElement Filtermonth;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]")
	private WebElement FilterSelectmonth;

	@AndroidFindBy(id = "com.north.ambassador:id/activity_task_history_on_time_rb")
	private WebElement ontimeBtn;

	@AndroidFindBy(id = "com.north.ambassador:id/activity_task_history_delayed_rb")
	private WebElement delayedBtn;

	@AndroidFindBy(id = "com.north.ambassador:id/activity_task_history_missed_rb")
	private WebElement MissedBtn;

	@AndroidFindBy(id = "com.north.ambassador:id/activity_task_history_apply_filter_btn")
	private WebElement ApplyFilterBtn;

	@AndroidFindBy(id = "com.north.ambassador:id/activity_task_history_close_tv")
	private WebElement FiltercloseBtn;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[6]")
	private WebElement VerifyTaskHistory;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView")
	private WebElement CashDisapproved;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.TextView")
	private WebElement CashInHand;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.TextView")
	private WebElement PendingFinanceApproval;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.TextView")
	private WebElement CashHandedOver;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[6]/android.widget.CheckedTextView")
	private WebElement Conveyance;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView[1]")
	private WebElement VerifyConveyance;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[7]/android.widget.CheckedTextView")
	private WebElement Attendance;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[8]/android.widget.CheckedTextView")
	private WebElement additions;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ExpandableListView/android.view.ViewGroup[1]/android.widget.TextView[2]")
	private WebElement payoutDropOpen1;

	@AndroidFindBy(id = "com.north.ambassador:id/exp_arrow")
	private WebElement payoutDropClose1;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ExpandableListView/android.view.ViewGroup[2]/android.widget.TextView[1]")
	private WebElement payoutDW2;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ExpandableListView/android.view.ViewGroup[2]/android.widget.TextView[2]")
	private WebElement payoutDropClose2;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ExpandableListView/android.view.ViewGroup[3]/android.widget.TextView[2]")
	private WebElement payoutDW3;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ExpandableListView/android.view.ViewGroup[2]/android.widget.TextView[2]")
	private WebElement payoutDropClose3;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ExpandableListView/android.view.ViewGroup[4]/android.widget.TextView[2]")
	private WebElement payoutDW4;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ExpandableListView/android.view.ViewGroup[4]/android.widget.TextView[2]")
	private WebElement payoutDropClose4;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ExpandableListView/android.view.ViewGroup[5]/android.widget.TextView[2]")
	private WebElement payoutDW5;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ExpandableListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	private WebElement VerifyPayout;

	@AndroidFindBy(id = "com.north.ambassador:id/activity_payment_list_year_sp")
	private WebElement Paymentyear;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]")
	private WebElement Paymentyearselect;

	@AndroidFindBy(id = "com.north.ambassador:id/activity_payment_list_month_sp")
	private WebElement Paymentmonth;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]")
	private WebElement Paymentmonthselect;

	@AndroidFindBy(id = "com.north.ambassador:id/activity_payment_list_cycle_sp")
	private WebElement Paymentdate;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")
	private WebElement Paymentdateselect;

	@AndroidFindBy(id = "com.north.ambassador:id/activity_payment_list_no_data_tv")
	private WebElement Verifypayment;

	@AndroidFindBy(id = "com.north.ambassador:id/activity_reports_no_data_tv")
	private WebElement VerifyDeduction;

	@AndroidFindBy(id = "com.north.ambassador:id/activity_reports_no_data_tv")
	private WebElement VerifyAttendance;

	@AndroidFindBy(id = "com.north.ambassador:id/activity_reports_no_data_tv")
	private WebElement VerifyAddition;

	@AndroidFindBy(id = "com.north.ambassador:id/activity_imageview_tv")
	private WebElement Verifyaudit;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[1]")
	private WebElement VerifyMishap;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[3]")
	private WebElement VerifyBankdetails;

	@AndroidFindBy(accessibility = "content_image")
	private WebElement takeAmbSelfie;

	@AndroidFindBy(id = "com.north.ambassador:id/activity_audit_comment_etv")
	private WebElement comments;

	@AndroidFindBy(id = "com.north.ambassador:id/activity_ambassador_audit_btn")
	private WebElement AuditSubmit;

	@AndroidFindBy(id = "android:id/button2")
	private WebElement AuditSubmitNo;

	@AndroidFindBy(id = "android:id/button1")
	private WebElement AuditSubmitYes;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]")
	private WebElement VerifyNotification;

	@AndroidFindBy(id = "com.north.ambassador:id/activity_retraining_pick_up_tv")
	private WebElement RetrainingPU;

	@AndroidFindBy(id = "com.north.ambassador:id/activity_retraining_drop_off_tv")
	private WebElement RetrainingDU;

	@AndroidFindBy(id = "com.north.ambassador:id/activity_retraining_hamburger_menu_tv")
	private WebElement RetrainingMenu;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.Toast")
	private WebElement toastmesssage;

	public void EditProfile() throws InterruptedException {
		// Click on Edit Profile
		
		EditProfile.click();
		String AmbName = VerifyProfileName.getText();
		softassert.assertEquals(AmbName, "keerthana ", "Not clicked on Profile");

		// Click on ID card
		Thread.sleep(2000);
		Idcard.click();
		IdcardTap.click();
		String AmbId = VerifyEmployeeid.getText();
		softassert.assertEquals(AmbId, "604066", "Not clicked on ID");
		profilebackBtn.click();

		// Click on DL
		DL.click();
		String DL1 = VerifyDL.getText();
		softassert.assertEquals(DL1, "Driving License", "Not clicked on DL");
		FrontDL.click();
		CameraPopup.click();
		Camera.click();
		CameraOk.click();
		BackDL.click();
		CameraPopup.click();
		Camera.click();
		CameraOk.click();
		profilebackBtn.click();

		// Click on LanguageSettings
		LanguageSettings.click();
		String LS = VerifyLanguageSettings.getText();
		softassert.assertEquals(LS, "Select Language", "Not clicked on LanguageSettings");
		Thread.sleep(2000);
		if (SetEnglish.getText().contains("English")) {
			skip.click();

		} else {
			SetEnglish.click();
			EnglishPopupOk.click();
			Thread.sleep(2000);
			hamburgerMenu.click();

		}

		// Click on ProfessionalDetails
		ProfessionalDetails.click();
		String PD = VerifyProfessionalDetails.getText();
		softassert.assertEquals(PD, "Xavier Joseph", "Not clicked on ProfessionalDetails");
		ProfessionalDetails.click();

		// Click on BankDetails
		BankDetails.click();
		String BD = VerifyBankDetails.getText();
		softassert.assertEquals(BD, "Bank Name", "Not clicked on BankDetails");
		BankDetails.click();
		driver.navigate().back();
		softassert.assertAll();

	}

	public void Off_ON_duty() throws InterruptedException {

		if (Off_ON_duty.getText().equalsIgnoreCase("OFF DUTY")) {

			// This code will longPress on the element
			((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
					ImmutableMap.of("elementId", ((RemoteWebElement) Off_ON_duty).getId(), "duration", 2000));
			Thread.sleep(2000);
		} else if (Off_ON_duty.getText().equalsIgnoreCase("ON DUTY")) {
			System.out.println("ON Duty is enabled by default");

		}
	}

	public void hamburgerMenu() throws InterruptedException {

		if (hamburgerMenu.isDisplayed()) {
			Thread.sleep(1000);
			hamburgerMenu.click();

		}

		else {
			//This code will swipe the screen in the right direction
			((JavascriptExecutor) driver).executeScript("mobile: swipeGesture",
					ImmutableMap.of("elementId", ((RemoteWebElement) hamburgerMenu).getId(),

							"direction", "right", "percent", 0.75));
		}
	}

	public void hamburgerMenu1() {

			hamburgerMenu1.click();
		
	}

	public void Backarrow() {

		Backarrow.click();
	}

	public void Camera() {
		Camera.click();
	}

	public void CameraOk() {
		CameraOk.click();
	}

	public void vaccination() throws InterruptedException {
		vaccination.click();
		String LS = Verifyvaccination.getText();
		softassert.assertEquals(LS, "Current Vaccination Status", "Not clicked on Vaccination");
		Thread.sleep(2000);

		dose1.click();
		Thread.sleep(1000);

		String xmlFormat = driver.getPageSource();
		if (xmlFormat.contains("Certificate has already been submitted. Please wait while we are reviewing it.")) {

			System.out.println(toastmesssage.getText());
			driver.navigate().back();

		} else {
			Camera.click();
			CameraOk.click();
			dose2.click();
			Camera.click();
			CameraOk.click();
			VaccinationSubmit.click();
			VaccinationImageUploadedpopup.click();
			Backarrow.click();
		}
	}

	public void Performance() throws InterruptedException {
		Performance.click();
		Thread.sleep(2000);
		String perform = Verifyperformance.getText();
		softassert.assertEquals(perform, "Tasks completed On-Time", "Not clicked on Performance");
		softassert.assertAll();
		Thread.sleep(2000);
		System.out.println("Task Completed Total percent = " + TaskPercent.getText());
		System.out.println("Task Completed On time = " + TaskOntime.getText());
		System.out.println("Task Delayed =" + TaskDelayed.getText());
		System.out.println("Task Missed =" + TaskMissed.getText());

	}

	public void taskDetailsBtn() throws InterruptedException {
		//Click on Task details button in Performance
		Thread.sleep(2000);
		taskDetailsBtn.click();
		Thread.sleep(1000);
		if (VerifyTaskHistory.isDisplayed()) {
			driver.navigate().back();
			Backarrow.click();

		} else {
			System.out.println("toastmesssage.getText()");
			toastmesssage.getText().equals("No Task Data");
			driver.navigate().back();
		}

	}

	public void Goals() throws InterruptedException {
		Goals.click();
		Thread.sleep(2000);
		String goals = VerifyGoals.getText();
		softassert.assertEquals(goals, "Consistency through the week", "Not clicked on Goals");
		softassert.assertAll();

		System.out.println("Tasks to complete the challenge and earn the First Incentive - " + dailyIncentive.getText());
		System.out
				.println("Tasks more to complete the challenge and unlock the incentive - " + WeeklyIncentive.getText());

	}

	public void History() throws InterruptedException {
		History.click();

		TaskhistoryFilter.click();

		// To move the slider in X direction

		// Get start point of slider.
		int startX = KmSlider.getLocation().getX();
		System.out.println(startX);

		// Get vertical location of slider.
		int startY = KmSlider.getLocation().getY();
		System.out.println(startY);

		// Get end point of slider.
		int endX = KmSlider.getSize().getWidth();
		System.out.println(endX);

		// Set slider move to position.
		// endX * 0.6 means at 60% of seek bar width.
		// endX * 0.9 means at 100% of seek bar width.
		int moveToXDirectionAt = (int) (endX * 0.6);
		System.out.println("Moving seek bar at " + moveToXDirectionAt + " In X direction.");

		// Moving seekbar using TouchAction class.
		TouchAction act = new TouchAction(driver);
		act.press(PointOption.point(startX, startY)).moveTo(PointOption.point(moveToXDirectionAt, startY)).release()
				.perform();

		//Click on the filter year, month and date
		Filteryear.click();
		FilterSelectyear.click();
		Filtermonth.click();
		FilterSelectmonth.click();
		ontimeBtn.click();
		ApplyFilterBtn.click();
		Thread.sleep(2000);

		String history = VerifyTaskHistory.getText();
		softassert.assertEquals(history, "On Time", "Filter is not applied");
		softassert.assertAll();
		driver.navigate().back();

	}

	public void CustomerCash() throws InterruptedException {
	
		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Customer Cash\"))")).click();

		System.out.println(CashDisapproved.getText());
		System.out.println(CashInHand.getText());
		System.out.println(PendingFinanceApproval.getText());
		System.out.println(CashHandedOver.getText());

		driver.navigate().back();
	}

	public void Conveyance() {
		Conveyance.click();
		System.out.println("Conveyance - "+VerifyConveyance.getText());
		String convey = VerifyConveyance.getText();
		softassert.assertEquals(convey, "Reason", "Conveyance is not clicked");
		softassert.assertAll();

	}

	public void Attendance() {
		Attendance.click();
		System.out.println("Attendance - "+VerifyAttendance.getText());
		String a = VerifyAttendance.getText();
		softassert.assertEquals(a, "No data", "Attendance is not clicked");
		softassert.assertAll();

	}

	public void additions() {
		additions.click();
		System.out.println("Additions - "+VerifyAddition.getText());
		String add = VerifyAddition.getText();
		softassert.assertEquals(add, "No data", "additions is not clicked");
		softassert.assertAll();
	}

	public void payout() {

		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Payout\"))"))
				.click(); // scroll down to click on the element

		payoutDropOpen1.click();
		String payout1 = VerifyPayout.getText();
		softassert.assertEquals(payout1, "Cancelled Task Count", "Payout dropdown1 is not clicked");
		payoutDropClose1.click();

		payoutDW2.click();
		String payout2 = VerifyPayout.getText();
		softassert.assertEquals(payout2, "On time performance", "Payout dropdown2 is not clicked");
		payoutDropClose2.click();

		payoutDW3.click();
		String payout3 = VerifyPayout.getText();
		softassert.assertEquals(payout3, "Morning Task Incentive", "Payout dropdown3 is not clicked");
		payoutDropClose3.click();

		payoutDW4.click();
		String payout4 = VerifyPayout.getText();
		softassert.assertEquals(payout4, "Missed Task", "Payout dropdown4 is not clicked");
		payoutDropClose4.click();

		payoutDW5.click();
		String payout5 = VerifyPayout.getText();
		softassert.assertEquals(payout5, "Refundable Security Deposit", "Payout dropdown4 is not clicked");
		driver.navigate().back();
		softassert.assertAll();

	}

	public void Payment() throws InterruptedException {
		
		//Scroll  till the payment
		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Payment\"))"))
				.click();
		Thread.sleep(2000);
		Paymentyear.click();
		Paymentyearselect.click();
		Paymentmonth.click();
		Paymentmonthselect.click();
		System.out.println("Payment - "+Verifypayment.getText());
		String pay = Verifypayment.getText();
		softassert.assertEquals(pay, "No data", "Payment is not clicked");
		softassert.assertAll();

	}

	public void deductions() throws InterruptedException {

		//Scroll till the deduction
		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Deductions\"))"))
				.click();
		Thread.sleep(1000);
		System.out.println("deductions - "+VerifyDeduction.getText());
		String deduct = VerifyDeduction.getText();
		softassert.assertEquals(deduct, "No data", "Deduction is not clicked");
		softassert.assertAll();

	}

	public void Mishaps() {
		//Scroll till the Mishaps
		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Mishaps\"))"))
				.click();
		System.out.println("Mishaps - "+VerifyMishap.getText());
		String mishap = VerifyMishap.getText();
		softassert.assertEquals(mishap, "Mishap On", "Mishap is not clicked");
		softassert.assertAll();

	}

	public void BankDetails() {
		driver.findElement(AppiumBy
				.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Bank details\"))"))
				.click();
		System.out.println("BankDetails - "+VerifyBankdetails.getText());
		String bank = VerifyBankdetails.getText();
		softassert.assertEquals(bank, "HDFC", "Bank details is not clicked");
		softassert.assertAll();

	}

	public void Audit() throws InterruptedException {
		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Audit\"))"))
				.click();
		System.out.println("Audit - "+Verifyaudit.getText());
		String bank = Verifyaudit.getText();
		softassert.assertEquals(bank, "Tap here to take selfie with Ambassador", "Audit is not clicked");
		softassert.assertAll();

		takeAmbSelfie.click();
		Camera.click();
		CameraOk.click();
		Thread.sleep(1000);
		System.out.println(toastmesssage.getText());

	}

	public void AuditCommentNo(String text) throws InterruptedException {
		// In audit, When "No" in the pop up is selected
		comments.sendKeys(text);
		Thread.sleep(2000);
		AuditSubmit.click();
		AuditSubmitNo.click();
	}

	public void AuditCommentYes(String text) throws InterruptedException {
		// In audit, When "Yes" in the pop up is selected
		comments.sendKeys(text);
		Thread.sleep(2000);
		AuditSubmit.click();
		AuditSubmitYes.click();
	}

	public void Notification() {
		driver.findElement(AppiumBy
				.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Notifications\"))"))
				.click();
		System.out.println("Notification - "+VerifyNotification.getText());
		String notify = VerifyNotification.getText();
		softassert.assertEquals(notify, "Date/Time", "Notification is not clicked");
		softassert.assertAll();

	}

	public void Retraining() throws InterruptedException {
		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Retraining\"))"))
				.click();
		System.out.println("Retraining - "+RetrainingPU.getText());
		String notify = RetrainingPU.getText();
		softassert.assertEquals(notify, "Pick Up", "Retraining is not clicked");
		softassert.assertAll();

		Thread.sleep(2000);
		RetrainingPU.click();
		driver.navigate().back();
		RetrainingDU.click();
		driver.navigate().back();
		RetrainingMenu.click();
		driver.navigate().back();

	}

}
