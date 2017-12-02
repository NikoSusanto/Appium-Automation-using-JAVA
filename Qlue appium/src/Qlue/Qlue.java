package Qlue;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
 
import java.net.MalformedURLException;
 
import java.net.URL;
 
import java.util.concurrent.TimeUnit;
 
 
import org.openqa.selenium.By;
 
import org.openqa.selenium.remote.CapabilityType;
 
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Qlue {

	private static RemoteWebDriver driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {


		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");

		capabilities.setCapability("deviceName", "Samsung Galaxy S4-4.2.2-API17-1080x1920");

		capabilities.setCapability("platformVersion", "4.2.2");

		capabilities.setCapability("platformName", "Android");

		capabilities.setCapability("appPackage", "org.qluein.android");
		
		capabilities.setCapability("appActivity", "org.qluein.android.features.auth.LoginAct");

		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Log in with email
		driver.findElement(By.xpath("//android.widget.TextView[@text='Log in with Email']")).click();
		
		// Masukan username
		driver.findElement(By.xpath("//android.widget.EditText[@index='2']")).sendKeys("nikosusant");	
		
		// Masukan password
		driver.findElement(By.xpath("//android.widget.EditText[@index='3']")).sendKeys("nikosusant");	
		
		// Next
		driver.findElement(By.xpath("//android.widget.TextView[@index='0']")).click();
		Thread.sleep(10000);
		
		// Next
		driver.findElement(By.xpath("//android.widget.ImageView[@index='0']")).click();
		
		// Next
		driver.findElement(By.xpath("//android.widget.ImageView[@index='1']")).click();
		
		// Next
		driver.findElement(By.xpath("//android.widget.ImageView[@index='1']")).click();
		
		// Start
		driver.findElement(By.xpath("//android.widget.ImageView[@index='1']")).click();
		
		// Edit profiles
		driver.findElement(By.xpath("//android.widget.ImageButton[@index='3']")).click();
		
		// Nanti dihapus
		Thread.sleep(10000);
		driver.findElement(By.xpath("//android.widget.Button[@index='0']")).click();
		
		// Klik avatar
		driver.findElement(By.xpath("//android.widget.ImageView[@NAF='true']")).click();
			
		// Pilih avatar
		driver.findElement(By.xpath("//android.widget.TextView[@text='Rocker']")).click();
		Thread.sleep(3000);
		
		// Save
		driver.findElement(By.xpath("//android.widget.TextView[@text='Save']")).click();
		Thread.sleep(4000);
		
		//kembali ke home page
		driver.findElement(By.xpath("//android.widget.ImageButton[@index='0']")).click();
		Thread.sleep(3000);
		
		// Pilih jenis laporan
		driver.findElement(By.xpath("//android.view.View[@NAF='true']")).click();
		
		// Report Local Issue
		driver.findElement(By.xpath("//android.widget.TextView[@text='Report Local Issue']")).click();
		
		// Foto
		driver.findElement(By.xpath("//android.widget.ImageView[@index='5']")).click();
		
		// Checklist
		driver.findElement(By.xpath("//android.widget.ImageButton[@index='3']")).click();
		Thread.sleep(5000);
		
		// Pilih kategori
		driver.findElement(By.xpath("//android.widget.RelativeLayout[@index='0']")).click();
		
		// Masukan keterangan
		driver.findElement(By.xpath("//android.widget.MultiAutoCompleteTextView[@index='5']")).sendKeys("QA Testing #beraniberubah");	
		
		// Post
		driver.findElement(By.xpath("//android.widget.TextView[@text='POST']")).click();
				
				
		Thread.sleep(10000);
		// close the application
		//driver.quit();

	}
}