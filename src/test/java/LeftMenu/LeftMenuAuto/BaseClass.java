package LeftMenu.LeftMenuAuto;

import org.testng.annotations.BeforeClass;


import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

//public AppiumDriverLocalService service;
public AndroidDriver driver;

@BeforeClass
public void appiumtest() throws MalformedURLException, InterruptedException {
	
	
//	service =new AppiumServiceBuilder().withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js"))
//			.withIPAddress("127.0.0.1").usingPort(4723).build();
//    UiAutomator2Options options = new UiAutomator2Options();
//	options.setDeviceName("Android"); // emulator
//	options.setApp("//Users//21north//Documents//AmbAppAutomation//src//test//java//Resources//app-ambassador-debug.apk");
//    driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
   
	
	    DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"vivo1818");
//		cap.setCapability(MobileCapabilityType.UDID,"8abcca43");
//		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
	    cap.setCapability(MobileCapabilityType.APP, "D://LeftMenuAuto//src//test//java//Resources//app-ambassador-debug.apk");
	//	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UIAutomator2");
		cap.setCapability("autoAcceptAlerts", "true");
		cap.setCapability("autoGrantPermissions", "true");
		
		cap.setCapability("appWaitActivity","com.north.ambassador.activity.MainActivity");
		cap.setCapability("appWaitActivity", "com.north.ambassador");
		cap.setCapability("appWaitActivity", "com.north.ambassador.activity.LoginActivity");
		cap.setCapability("printPageSourceOnFindFailure", true);
		
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	
}



@AfterClass
public void tearDown() throws Exception {
	driver.quit();
	Thread.sleep(4000);
} 

}
