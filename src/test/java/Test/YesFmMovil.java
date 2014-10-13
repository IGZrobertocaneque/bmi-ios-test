package Test;

import io.appium.java_client.AppiumDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.By;

//Script Appium(Swipe y Precise Tab)
//import org.openqa.selenium.JavascriptExecutor;
//import java.util.HashMap;
 
public class YesFmMovil {
 
	public AppiumDriver driver;
 
    @Before
    public void setUp() throws Exception {
		
    	
    	DesiredCapabilities capabilities = new DesiredCapabilities();
	
    	//Real Device
    	capabilities.setCapability("appium-version", "1.0");
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("platformVersion", "7.1");
		capabilities.setCapability("deviceName", "iPhone");
		capabilities.setCapability("app", "/Users/PC1073/Library/Developer/Xcode/DerivedData/YesFm03-ckjwdxbvkaiukmelmojouqpllacm/Build/Products/Debug-iphonesimulator/YesFm03.app");
    	
		driver = new AppiumDriver(new URL("http://127.0.0.1:4726/wd/hub"),capabilities);
		
    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }

    //Prueba Simulador
    @Test
    public void testCases() throws InterruptedException {

    	Thread.sleep(5000);
    	
    	//Login
    	driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).sendKeys("martaigz");
    	driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIASecureTextField[1]")).sendKeys("martaa");
    	driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIAKeyboard[1]/UIAButton[4]")).click();
    	Thread.sleep(5000);
		//Menu
    	driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]/UIAStaticText[1]")).click();
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]/UIATextField[1]")).sendKeys("Aerosmith");
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIAKeyboard[1]/UIAButton[4]")).click();

		Thread.sleep(5000);
		//Reproducir lista
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAButton[1]")).click();
		
		
		
		//Menu
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[3]/UIAStaticText[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[8]/UIAStaticText[1]")).click();
		Thread.sleep(7000);
		
		
		//Salir
    	driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[14]/UIAStaticText[1]")).click();
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[3]/UIAAlert[1]/UIATableView[2]/UIATableCell[1]")).click();
		

	 driver.quit();
	System.out.println("Fin");
    }
    
    
    @After
    public void tearDown() throws Exception {
   
    	
   
    }

    
}





