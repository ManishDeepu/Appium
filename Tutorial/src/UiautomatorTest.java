import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UiautomatorTest extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// driver.findElemntbyUiAutomator("attribute('value')")
		//interview question
		driver.findElementByAndroidUIAutomator("text(\"Views\")");
		
		//validate that elements are clickable or not.
		// driver.findElemntbyUiAutomator("new UiSelector().property('value')")
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
		
		
		
		
		
	}

}
