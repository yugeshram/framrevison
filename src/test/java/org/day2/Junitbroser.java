package org.day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;import org.apache.hc.core5.util.Timeout;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Junitbroser {
	
	static WebDriver driver;
	@BeforeClass
	public static void launch() {
		ChromeDriverManager.chromedriver().setup();
		ChromeOptions opt  = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(opt);
		driver.get("https://www.facebook.com/");

	}
	
	@AfterClass
	public static void clos() {
	//	driver.close();
		long currentTimeMillis = System .currentTimeMillis();
		System.out.println(currentTimeMillis);

	}
	
	@Before
	
	public void scre() throws IOException {
		
		TakesScreenshot ss = (TakesScreenshot) driver;
		
		File src = ss.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File file = new File("C:\\Users\\muthu\\eclipse-workspace\\frameRev\\ss//img.png");
		FileUtils.copyFile(src, file);

	}
	
	@Test
	public void argu() {

		WebElement txtuser = driver.findElement(By.id("email"));
         txtuser.sendKeys("yugeshram");
        
         WebElement txtpass = driver.findElement(By.id("pass"));
         txtpass.sendKeys("12344");
		
         WebElement log = driver.findElement(By.name("login"));
         log.click();
         
         
		
	}
	@After
	public void scre2() throws IOException {
		TakesScreenshot ss = (TakesScreenshot) driver ;
		File screenshotAs = ss.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		File file1 = new File("C:\\Users\\muthu\\eclipse-workspace\\frameRev\\ss//img1.png");
		FileUtils.copyFile(screenshotAs, file1);
		
	}

}
