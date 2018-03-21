import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
//import java.lang.*;
import org.openqa.selenium.By;
//import org.openqa.selenium.Capabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class basics extends base {
	//public class ClassNotFoundExceptionExample {

	   // private static final String CLASS_TO_LOAD = "main.java.Utils";


	public static void main(String[] args) throws MalformedURLException{
	
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Different Identifier : Xpath, Id, className, androidUiautomator
		//xpath syntax ://tagName[@attribute='value']
		// pick attribute which have unique value.
		driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='WiFi settings']")).click();
		driver.findElement(By.className("android.widget.EditText")).sendKeys("Appu");
		driver.findElements(By.className("android.widget.Button")).get(1).click();
		
		}

}


