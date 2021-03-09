package appium.frst;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy.ByAccessibilityId;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;

public class CalculatorTest {

	static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
//	openCalcul();
//	openCalendar();	
//	openChrome();
//	openAmazon();
//	openCall();
//	sendSMS();
	toggleCubii();	
	}
	
	public static void openCalcul() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Ani_Redmi");
		cap.setCapability("udid", "c4f297cb0405");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9 PKQ1.180917.001");
		cap.setCapability("appPackage", "com.miui.calculator");
		cap.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,cap);
		
		System.out.println("Application Started");
		
		MobileElement removePopup = driver.findElementById("android:id/button1");
		removePopup.click();
		
		System.out.println("Application Started 2 ");
		
	//	driver.findElement(By.name("7")).click();
		
        MobileElement number7 = (MobileElement)(driver.findElement(By.name("7")));
        number7.click();
//		MobileElement number9 = driver.findElementByXPath("com.miui.calculator:id/btn_9_s");
//		MobileElement equals = driver.findElementByXPath("com.miui.calculator:id/btn_equal_s");
//		MobileElement rslt  = driver.findElementByXPath("com.miui.calculator:id/expression");
//		MobileElement plus  = driver.findElementByXPath("com.miui.calculator:id/btn_plus_s");
//		
		
		
		
//		plus.click();
//		number9.click();
//		equals.click();
		
	}

	public static void openCalendar() throws MalformedURLException
	{
        DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Ani_Redmi");
		cap.setCapability("udid", "c4f297cb0405");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9 PKQ1.180917.001");
		cap.setCapability("appPackage", "com.xiaomi.calendar");
		cap.setCapability("appActivity", "com.xiaomi.calendar.AllInOneActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,cap);
		
		System.out.println("Application Started");
		
		driver.findElement(By.id("android:id/button1")).click();
		
		driver.findElement(By.id("com.xiaomi.calendar:id/change_language")).click();
		
		driver.findElement(By.xpath("//android.view.View[@content-desc='25 March 2021 ( according to lunar calendar).Thursday']")).click();
		
		driver.findElement(By.id("com.xiaomi.calendar:id/action_bar_month_view")).click();
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.ScrollView/android.view.ViewGroup/android.view.View[7]")).click();
		
		driver.findElement(By.xpath("//android.view.View[@content-desc='16 July 2021 ( according to lunar calendar).Friday']")).click();
		
	}

	public static void openChrome() throws MalformedURLException
	{
        DesiredCapabilities cap = new DesiredCapabilities().android();
		
		cap.setCapability("deviceName", "Ani_Redmi");
		cap.setCapability("udid", "192.168.1.9:5555");
        cap.setCapability("no",true);
        cap.setCapability("noReset", true);
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9 PKQ1.180917.001");
		cap.setBrowserName(MobileBrowserType.CHROMIUM);
		//cap.setCapability("appPackage", "com.xiaomi.calendar");
		//cap.setCapability("appActivity", "com.xiaomi.calendar.AllInOneActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,cap);

        driver.get("http://");
        driver.context("NATIVE_APP");
        driver.findElement(By.xpath("//*[@id='url_bar']")).click();
        driver.context("WEBVIEW_1");
        driver.findElement(By.id("reload-button")).click();
        driver.context("NATIVE_APP");
        driver.findElement(By.xpath("//*[@id='menu_button']")).click();
        driver.context("WEBVIEW_1");
        driver.findElement(By.id("main-content")).click();
        driver.context("NATIVE_APP");
        driver.findElement(By.xpath("//*[@id='url_bar']")).click();
        driver.findElement(By.xpath("//*[@id='url_bar']")).sendKeys("msn.com");
        driver.executeScript("seetest:client.deviceAction(\"Enter\")");
        driver.context("WEBVIEW_1");
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Next Slide")));
        driver.findElement(By.linkText("Next Slide")).click();
        driver.findElement(By.linkText("Next Slide")).click();
        driver.findElement(By.linkText("Next Slide")).click();
        driver.findElement(By.linkText("Next Slide")).click();
        driver.findElement(By.linkText("Next Slide")).click();
        driver.findElement(By.linkText("Previous Slide")).click();
        driver.findElement(By.linkText("Previous Slide")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Previous Slide")));
        driver.findElement(By.linkText("Previous Slide")).click();
        driver.findElement(By.linkText("Next Slide")).click();
        driver.findElement(By.linkText("Next Slide")).click();
        driver.findElement(By.linkText("Next Slide")).click();
//        driver.pressKeyCode(AndroidKeyCode.HOME);

        
	}

	public static void openAmazon() throws MalformedURLException
	{
        DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Ani_Redmi");
		cap.setCapability("udid", "c4f297cb0405");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9 PKQ1.180917.001");
		cap.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		cap.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,cap);
		
		System.out.println("Application Started");
		
		driver.findElement(By.id("in.amazon.mShop.android.shopping:id/sso_continue")).click();
		driver.findElement(By.id("in.amazon.mShop.android.shopping:id/rs_search_src_text")).click();
		driver.findElement(By.id("in.amazon.mShop.android.shopping:id/rs_search_src_text")).sendKeys("car keys");
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[9]/android.widget.LinearLayout/android.widget.TextView")).click();
	}

	public static void openCall() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Ani_Redmi");
		cap.setCapability("udid", "c4f297cb0405");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9 PKQ1.180917.001");
		cap.setCapability("appPackage", "com.android.contacts");
		cap.setCapability("appActivity", "com.android.contacts.activities.TwelveKeyDialer");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,cap);
		
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout")).click();
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/miui.view.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[7]/android.widget.LinearLayout")).click();
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/miui.view.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[7]/android.widget.LinearLayout")).click();
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/miui.view.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[7]/android.widget.LinearLayout")).click();
//		driver.findElement(By.id("com.android.contacts:id/six")).click();
//		driver.findElement(By.id("com.android.contacts:id/zero")).click();
//		driver.findElement(By.id("com.android.contacts:id/two")).click();
//		driver.findElement(By.id("com.android.contacts:id/one")).click();
//		driver.findElement(By.id("com.android.contacts:id/three")).click();
//		driver.findElement(By.id("com.android.contacts:id/seven")).click();
//		driver.findElement(By.id("com.android.contacts:id/six")).click();
//		driver.findElement(By.id("com.android.contacts:id/seven")).click();
//		driver.findElement(By.id("com.android.contacts:id/call_sim2")).click();
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/miui.view.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[7]/android.widget.LinearLayout")).click();
		driver.findElement(By.id("com.android.contacts:id/nine")).click();
		driver.findElement(By.id("com.android.contacts:id/one")).click();
		driver.findElement(By.id("com.android.contacts:id/two")).click();
		driver.findElement(By.id("com.android.contacts:id/three")).click();
		driver.findElement(By.id("com.android.contacts:id/six")).click();
		driver.findElement(By.id("com.android.contacts:id/two")).click();
		driver.findElement(By.id("com.android.contacts:id/four")).click();
		driver.findElement(By.id("com.android.contacts:id/eight")).click();
		driver.findElement(By.id("com.android.contacts:id/three")).click();
		driver.findElement(By.id("com.android.contacts:id/two")).click();
		driver.findElement(By.id("com.android.contacts:id/call_sim2")).click();
	
	}

	public static void sendSMS() throws MalformedURLException, InterruptedException
	{
        DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Ani_Redmi");
		cap.setCapability("udid", "c4f297cb0405");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9 PKQ1.180917.001");
		cap.setCapability("appPackage", "com.android.mms");
		cap.setCapability("appActivity", "com.android.mms.ui.NewMessageActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,cap);
		
		Thread.sleep(3400);
		
		driver.findElement(By.id("com.android.mms:id/recent_contact_name")).click();
		driver.findElement(By.id("com.android.mms:id/embedded_text_editor")).click();
		driver.findElement(By.id("com.android.mms:id/embedded_text_editor")).sendKeys("Test 25");
		driver.findElement(By.id("com.android.mms:id/send_button")).click();
		driver.findElement(By.id("com.android.mms:id/tv_title")).click();
		driver.findElement(By.id("com.android.mms:id/send_button")).click();
	}
	
	public static void toggleCubii() throws MalformedURLException, InterruptedException
	{
        DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Ani_Redmi");
		cap.setCapability("udid", "c4f297cb0405");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9 PKQ1.180917.001");
		cap.setCapability("appPackage", "com.cubii");
		cap.setCapability("appActivity", "com.cubii.ui.SplashActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,cap);
		
		driver.findElement(By.id("com.cubii:id/ib_login_email")).click();
		
		Thread.sleep(1600);
		
		driver.findElement(By.id("com.cubii:id/editText")).click();
		Thread.sleep(3400);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.TextView[1]")).click();
		driver.findElement(By.id("com.cubii:id/btn_login")).click();
		Thread.sleep(3400);
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Close\"]")).click();
		Thread.sleep(3400);
		driver.findElement(By.id("com.cubii:id/imageView18")).click();
		driver.findElement(By.id("com.cubii:id/dark_swipe")).click();
		//driver.findElement(By.id("com.cubii:id/navigation_account")).click();
	//	driver.findElement(ByAccessibilityId.AccessibilityId("Account Management")).click();
	//	WebElement nvgtn = (WebElement) driver.findElementsByAccessibilityId("Account Management");
	//	nvgtn.click();
		Thread.sleep(3400);
	//	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView")).click();
		driver.findElement(By.id("com.cubii:id/switchCompat")).click();
		System.out.println(driver.findElement(By.id("com.cubii:id/txtMyCubiiSubText")).getText());
	}
}
